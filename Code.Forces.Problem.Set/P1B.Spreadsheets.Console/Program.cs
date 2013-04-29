using System;
using System.Text;
using System.Text.RegularExpressions;

namespace P1B.Spreadsheets.Console
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

				throw new ArgumentException("Invalid input string", "input");
			}
			catch (Exception)
			{
				throw new ArgumentException("Invalid input string", "input");
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
					long[] remainders = new long[30000];
					int remainderCount = 0;

					while (colNumber > 0)
					{
						long quotient = colNumber / (Spreadsheet.alphabet.Length);
						long remainder = colNumber % (Spreadsheet.alphabet.Length);

						if (remainder == 0)
						{
							remainder = 26;
							quotient--;
						}

						if (quotient < 0)
						{
							break;
						}

						remainders[remainderCount] = remainder;
						remainderCount++;

						colNumber = quotient;
					}

					/*int i = 0;

					while (i < remainderCount)
					{
						if (remainders[i] == 0
							&& remainders[remainderCount - 1] != 0)
						{
							int j = i;

							while (j < remainderCount && remainders[j] == 0)
							{
								remainders[j] = 26;
								j++;
							}

							remainders[j]--;
							i = j;
						}
						else
						{
							i++;
						}
					}*/

					int i = remainderCount - 1;

					/*while (i >= 0 && remainders[i] == 0)
					{
						i--;
					}*/

					while (i >= 0)
					{
						char c = Spreadsheet.alphabet[(int)(remainders[i] - 1)];
						stringBuilder.Append(c);
						i--;
					}

					stringBuilder.Append(this.row);

					return stringBuilder.ToString();

				default:
					return string.Empty;
			}
		}
	}

	class Program
	{
		static void Main(string[] args)
		{
			int n = int.Parse(System.Console.ReadLine());
			string[] inputs = new string[n];

			for (int i = 0; i < n; i++)
			{
				inputs[i] = System.Console.ReadLine();
			}

			for (int i = 0; i < n; i++)
			{
				Spreadsheet spreadsheet = new Spreadsheet(inputs[i]);

				if (spreadsheet.DisplayType == SpreadsheetDisplayType.Excel)
				{
					System.Console.WriteLine(spreadsheet.ToString(SpreadsheetDisplayType.RXCY));
				}
				else
				{
					System.Console.WriteLine(spreadsheet.ToString(SpreadsheetDisplayType.Excel));
				}
			}
		}
	}
}
