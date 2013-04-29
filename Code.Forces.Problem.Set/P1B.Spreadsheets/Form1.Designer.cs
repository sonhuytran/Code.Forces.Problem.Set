namespace P1B.Spreadsheets
{
	partial class Form1
	{
		/// <summary>
		/// Required designer variable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary>
		/// Clean up any resources being used.
		/// </summary>
		/// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
		protected override void Dispose(bool disposing)
		{
			if (disposing && (components != null))
			{
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Windows Form Designer generated code

		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.label1 = new System.Windows.Forms.Label();
			this.txtInput = new System.Windows.Forms.TextBox();
			this.btnExecute = new System.Windows.Forms.Button();
			this.label2 = new System.Windows.Forms.Label();
			this.txtOutput = new System.Windows.Forms.TextBox();
			this.SuspendLayout();
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(13, 13);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(140, 14);
			this.label1.TabIndex = 0;
			this.label1.Text = "Inputs (ONE string only)";
			// 
			// txtInput
			// 
			this.txtInput.Location = new System.Drawing.Point(16, 31);
			this.txtInput.Name = "txtInput";
			this.txtInput.Size = new System.Drawing.Size(313, 22);
			this.txtInput.TabIndex = 1;
			// 
			// btnExecute
			// 
			this.btnExecute.Location = new System.Drawing.Point(16, 59);
			this.btnExecute.Name = "btnExecute";
			this.btnExecute.Size = new System.Drawing.Size(313, 23);
			this.btnExecute.TabIndex = 2;
			this.btnExecute.Text = "&Execute";
			this.btnExecute.UseVisualStyleBackColor = true;
			this.btnExecute.Click += new System.EventHandler(this.btnExecute_Click);
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Location = new System.Drawing.Point(13, 85);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(52, 14);
			this.label2.TabIndex = 3;
			this.label2.Text = "Outputs";
			// 
			// txtOutput
			// 
			this.txtOutput.BackColor = System.Drawing.SystemColors.ControlLightLight;
			this.txtOutput.Location = new System.Drawing.Point(16, 102);
			this.txtOutput.Name = "txtOutput";
			this.txtOutput.ReadOnly = true;
			this.txtOutput.Size = new System.Drawing.Size(313, 22);
			this.txtOutput.TabIndex = 4;
			// 
			// Form1
			// 
			this.AcceptButton = this.btnExecute;
			this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(341, 137);
			this.Controls.Add(this.btnExecute);
			this.Controls.Add(this.txtOutput);
			this.Controls.Add(this.txtInput);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.label1);
			this.Font = new System.Drawing.Font("Tahoma", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
			this.HelpButton = true;
			this.MaximizeBox = false;
			this.MinimizeBox = false;
			this.Name = "Form1";
			this.Text = "P1B. Spreadsheet";
			this.HelpButtonClicked += new System.ComponentModel.CancelEventHandler(this.Form1_HelpButtonClicked);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.TextBox txtInput;
		private System.Windows.Forms.Button btnExecute;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.TextBox txtOutput;
	}
}

