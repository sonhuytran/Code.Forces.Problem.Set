using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace P1B.Spreadsheets
{
	public enum SpreadsheetDisplayType
	{
		Excel,
		RXCY
	}

	public class Spreadsheet
	{
		private long col;
		private long row;
		private SpreadsheetDisplayType displayType;

		public SpreadsheetDisplayType DisplayType
		{
			get
			{
				return this.displayType;
			}
		}

		private static readonly string alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		public Spreadsheet(string input)
		{
			try
			{
				Regex regex1 = new Regex(@"\bR(?<row>[0-9]+?)C(?<col>[0-9]+)\b",
					RegexOptions.Singleline | RegexOptions.IgnoreCase);
				Match match1 = regex1.Match(input);

				if (match1.Success)
				{
					this.row = long.Parse(match1.Groups["row"].Value);
					this.col = long.Parse(match1.Groups["col"].Value);
					this.displayType = SpreadsheetDisplayType.RXCY;

					return;
				}

				Regex regex2 = new Regex(@"\b(?<col>[A-Za-z]+)(?<row>[0-9]+)\b");
				Match match2 = regex2.Match(input);

				if (match2.Success)
				{
					this.row = long.Parse(match2.Groups["row"].Value);

					string colString = match2.Groups["col"].Value;
					long colValue = 0;
					int power = 0;

					for (int i = colString.Length - 1; i >= 0; i--)
					{
						char colChar = colString[i];
						int x = Spreadsheet.alphabet.IndexOf(colChar) + 1;
						colValue += (long)Math.Pow(Spreadsheet.alphabet.Length, power) * x;
						power++;
					}

					this.col = colValue;
					this.displayType = SpreadsheetDisplayType.Excel;

					return;
				}

				throw new ArgumentException(Properties.Resources.invalid_input_string, "input");
			}
			catch (Exception)
			{
				throw new ArgumentException(Properties.Resources.invalid_input_string, "input");
			}
		}

		public string ToString(SpreadsheetDisplayType displayType)
		{
			switch (displayType)
			{
				case SpreadsheetDisplayType.RXCY:
					return string.Format("R{0}C{1}", this.row, this.col);

				case SpreadsheetDisplayType.Excel:
					StringBuilder stringBuilder = new StringBuilder();
					long colNumber = this.col;

					if (colNumber % (Spreadsheet.alphabet.Length) == 0)
					{
						colNumber = colNumber--;
					}

					while (colNumber > 0)
					{
						long quotient = colNumber / (Spreadsheet.alphabet.Length);
						long remainder = colNumber % (Spreadsheet.alphabet.Length);

						if (remainder == 0)
						{
							remainder = Spreadsheet.alphabet.Length;
						}

						stringBuilder.Insert(0, Spreadsheet.alphabet[(int)(remainder - 1)]);
						colNumber = quotient;
					}

					if (this.col % (Spreadsheet.alphabet.Length) == 0)
					{
						stringBuilder[stringBuilder.Length - 1] =
							Spreadsheet.alphabet[Spreadsheet.alphabet.Length - 1];
					}

					stringBuilder.Append(this.row);

					return stringBuilder.ToString();

				default:
					return string.Empty;
			}
		}
	}
}
