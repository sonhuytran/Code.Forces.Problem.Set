using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace P1B.Spreadsheets
{
	public partial class Form1 : Form
	{
		public Form1()
		{
			InitializeComponent();
		}

		private void Form1_HelpButtonClicked(object sender, CancelEventArgs e)
		{
			(new About()).ShowDialog();
		}

		private void btnExecute_Click(object sender, EventArgs e)
		{
			try
			{
				Spreadsheet spreadsheet = new Spreadsheet(this.txtInput.Text);

				if (spreadsheet.DisplayType == SpreadsheetDisplayType.Excel)
				{
					this.txtOutput.Text = spreadsheet.ToString(SpreadsheetDisplayType.RXCY);
				}
				else
				{
					this.txtOutput.Text = spreadsheet.ToString(SpreadsheetDisplayType.Excel);
				}
			}
			catch (Exception ex)
			{
				MessageBox.Show(ex.Message);
			}			
		}
	}
}
