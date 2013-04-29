namespace P1A.Theatre.Square
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
			this.lblInputs = new System.Windows.Forms.Label();
			this.label1 = new System.Windows.Forms.Label();
			this.txtInputs = new System.Windows.Forms.TextBox();
			this.label2 = new System.Windows.Forms.Label();
			this.label3 = new System.Windows.Forms.Label();
			this.txtOutputs = new System.Windows.Forms.TextBox();
			this.btnExecute = new System.Windows.Forms.Button();
			this.SuspendLayout();
			// 
			// lblInputs
			// 
			this.lblInputs.AutoSize = true;
			this.lblInputs.Location = new System.Drawing.Point(13, 13);
			this.lblInputs.Name = "lblInputs";
			this.lblInputs.Size = new System.Drawing.Size(324, 14);
			this.lblInputs.TabIndex = 0;
			this.lblInputs.Text = "Enter 3 values n, m and a sperated by SPACES characters";
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(13, 40);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(136, 14);
			this.label1.TabIndex = 0;
			this.label1.Text = "(1 <= n, m, a <= 109)";
			// 
			// txtInputs
			// 
			this.txtInputs.Location = new System.Drawing.Point(16, 57);
			this.txtInputs.Name = "txtInputs";
			this.txtInputs.Size = new System.Drawing.Size(326, 22);
			this.txtInputs.TabIndex = 0;
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Location = new System.Drawing.Point(155, 40);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(72, 14);
			this.label2.TabIndex = 0;
			this.label2.Text = "(e.g. 6 6 4)";
			// 
			// label3
			// 
			this.label3.AutoSize = true;
			this.label3.Location = new System.Drawing.Point(13, 112);
			this.label3.Name = "label3";
			this.label3.Size = new System.Drawing.Size(170, 14);
			this.label3.TabIndex = 0;
			this.label3.Text = "Number of flagstones needed";
			// 
			// txtOutputs
			// 
			this.txtOutputs.BackColor = System.Drawing.SystemColors.ControlLightLight;
			this.txtOutputs.Location = new System.Drawing.Point(16, 129);
			this.txtOutputs.Name = "txtOutputs";
			this.txtOutputs.ReadOnly = true;
			this.txtOutputs.Size = new System.Drawing.Size(326, 22);
			this.txtOutputs.TabIndex = 1;
			// 
			// btnExecute
			// 
			this.btnExecute.Location = new System.Drawing.Point(16, 86);
			this.btnExecute.Name = "btnExecute";
			this.btnExecute.Size = new System.Drawing.Size(326, 23);
			this.btnExecute.TabIndex = 2;
			this.btnExecute.Text = "&Execute";
			this.btnExecute.UseVisualStyleBackColor = true;
			this.btnExecute.Click += new System.EventHandler(this.btnExecute_Click);
			// 
			// Form1
			// 
			this.AcceptButton = this.btnExecute;
			this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 14F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(354, 162);
			this.Controls.Add(this.btnExecute);
			this.Controls.Add(this.txtOutputs);
			this.Controls.Add(this.txtInputs);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.label1);
			this.Controls.Add(this.label3);
			this.Controls.Add(this.lblInputs);
			this.Font = new System.Drawing.Font("Tahoma", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
			this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
			this.HelpButton = true;
			this.MaximizeBox = false;
			this.MinimizeBox = false;
			this.Name = "Form1";
			this.Text = "P1A. Theatre Square";
			this.HelpButtonClicked += new System.ComponentModel.CancelEventHandler(this.Form1_HelpButtonClicked);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label lblInputs;
		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.TextBox txtInputs;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.Label label3;
		private System.Windows.Forms.TextBox txtOutputs;
		private System.Windows.Forms.Button btnExecute;
	}
}

