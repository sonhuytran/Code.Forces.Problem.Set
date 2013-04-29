using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace P1A.Theatre.Square
{
	public partial class Form1 : Form
	{
		public Form1()
		{
			InitializeComponent();
		}

		private void Form1_HelpButtonClicked(object sender, CancelEventArgs e)
		{
			(new AboutP1A()).ShowDialog();
		}

		private bool GetInputs(out int n, out int m, out int a)
		{
			try
			{
				string[] inputs = this.txtInputs.Text.Split(" ".ToCharArray(),
					StringSplitOptions.RemoveEmptyEntries);

				n = int.Parse(inputs[0]);
				m = int.Parse(inputs[1]);
				a = int.Parse(inputs[2]);

				return true;
			}
			catch (Exception)
			{
				n = 1;
				m = 1;
				a = 1;

				throw new ArgumentException(Properties.Resources.invalid_inputs,
					"n, m, a");
			}
		}

		private void btnExecute_Click(object sender, EventArgs e)
		{
			int n = 0, m = 0, a = 0;

			try
			{
				this.GetInputs(out n, out m, out a);
				TheatreSquare theatreSquareProblem = new TheatreSquare(n, m, a);
				this.txtOutputs.Text = theatreSquareProblem.GetNFlagstone().ToString();
			}
			catch (ArgumentException ex)
			{
				MessageBox.Show(ex.Message,
					Properties.Resources.error,
					MessageBoxButtons.OK,
					MessageBoxIcon.Error);
			}
			catch (Exception ex)
			{
				MessageBox.Show(ex.Message,
					Properties.Resources.error,
					MessageBoxButtons.OK,
					MessageBoxIcon.Error);
				throw;
			}
		}
	}
}
