namespace practice01
{
    partial class Form1
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.panel1 = new System.Windows.Forms.Panel();
            this.panel2 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.button5 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.button8 = new System.Windows.Forms.Button();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.buttonTask = new System.Windows.Forms.Button();
            this.buttonCalender = new System.Windows.Forms.Button();
            this.buttonSellers = new System.Windows.Forms.Button();
            this.buttonDashborad = new System.Windows.Forms.Button();
            this.panel3 = new System.Windows.Forms.Panel();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.label4 = new System.Windows.Forms.Label();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.checkBox2 = new System.Windows.Forms.CheckBox();
            this.checkBox3 = new System.Windows.Forms.CheckBox();
            this.checkBox4 = new System.Windows.Forms.CheckBox();
            this.panelLeft = new System.Windows.Forms.Panel();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.panel3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.buttonTask);
            this.panel1.Controls.Add(this.buttonCalender);
            this.panel1.Controls.Add(this.buttonSellers);
            this.panel1.Controls.Add(this.buttonDashborad);
            this.panel1.Controls.Add(this.panel2);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(160, 450);
            this.panel1.TabIndex = 0;
            // 
            // panel2
            // 
            this.panel2.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.panel2.Controls.Add(this.label2);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(160, 63);
            this.panel2.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("HY목각파임B", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(186, 47);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(137, 19);
            this.label1.TabIndex = 2;
            this.label1.Text = "Total Sales";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("HY목각파임B", 27.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label2.Location = new System.Drawing.Point(54, 18);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(52, 37);
            this.label2.TabIndex = 3;
            this.label2.Text = "M";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("HY목각파임B", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label3.Location = new System.Drawing.Point(186, 47);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(137, 19);
            this.label3.TabIndex = 2;
            this.label3.Text = "Total Sales";
            // 
            // button5
            // 
            this.button5.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button5.Font = new System.Drawing.Font("HY목각파임B", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button5.Location = new System.Drawing.Point(696, 44);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(77, 30);
            this.button5.TabIndex = 4;
            this.button5.Text = "week";
            this.button5.UseVisualStyleBackColor = true;
            // 
            // button6
            // 
            this.button6.FlatAppearance.BorderSize = 0;
            this.button6.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button6.Font = new System.Drawing.Font("HY목각파임B", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button6.Location = new System.Drawing.Point(613, 44);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(77, 30);
            this.button6.TabIndex = 4;
            this.button6.Text = "month";
            this.button6.UseVisualStyleBackColor = true;
            // 
            // button7
            // 
            this.button7.FlatAppearance.BorderSize = 0;
            this.button7.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button7.Font = new System.Drawing.Font("HY목각파임B", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button7.Location = new System.Drawing.Point(530, 44);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(77, 30);
            this.button7.TabIndex = 4;
            this.button7.Text = "6-month";
            this.button7.UseVisualStyleBackColor = true;
            // 
            // button8
            // 
            this.button8.FlatAppearance.BorderSize = 0;
            this.button8.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button8.Font = new System.Drawing.Font("HY목각파임B", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button8.Location = new System.Drawing.Point(447, 44);
            this.button8.Name = "button8";
            this.button8.Size = new System.Drawing.Size(77, 30);
            this.button8.TabIndex = 4;
            this.button8.Text = "year";
            this.button8.UseVisualStyleBackColor = true;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::practice01.Properties.Resources._154638_110351_5856;
            this.pictureBox2.Location = new System.Drawing.Point(205, 83);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(583, 183);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 3;
            this.pictureBox2.TabStop = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::practice01.Properties.Resources._154638_110351_5856;
            this.pictureBox1.Location = new System.Drawing.Point(190, 83);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(583, 183);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 3;
            this.pictureBox1.TabStop = false;
            // 
            // buttonTask
            // 
            this.buttonTask.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this.buttonTask.FlatAppearance.BorderSize = 0;
            this.buttonTask.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonTask.ForeColor = System.Drawing.Color.White;
            this.buttonTask.Image = ((System.Drawing.Image)(resources.GetObject("buttonTask.Image")));
            this.buttonTask.Location = new System.Drawing.Point(0, 311);
            this.buttonTask.Name = "buttonTask";
            this.buttonTask.Size = new System.Drawing.Size(157, 68);
            this.buttonTask.TabIndex = 4;
            this.buttonTask.Text = "task";
            this.buttonTask.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.buttonTask.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            this.buttonTask.UseVisualStyleBackColor = true;
            this.buttonTask.Click += new System.EventHandler(this.buttonTask_Click);
            // 
            // buttonCalender
            // 
            this.buttonCalender.FlatAppearance.BorderSize = 0;
            this.buttonCalender.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonCalender.ForeColor = System.Drawing.Color.White;
            this.buttonCalender.Image = ((System.Drawing.Image)(resources.GetObject("buttonCalender.Image")));
            this.buttonCalender.Location = new System.Drawing.Point(0, 232);
            this.buttonCalender.Name = "buttonCalender";
            this.buttonCalender.Size = new System.Drawing.Size(157, 73);
            this.buttonCalender.TabIndex = 4;
            this.buttonCalender.Text = "calender";
            this.buttonCalender.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.buttonCalender.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            this.buttonCalender.UseVisualStyleBackColor = true;
            this.buttonCalender.Click += new System.EventHandler(this.buttonCalender_Click);
            // 
            // buttonSellers
            // 
            this.buttonSellers.FlatAppearance.BorderSize = 0;
            this.buttonSellers.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonSellers.ForeColor = System.Drawing.Color.White;
            this.buttonSellers.Image = ((System.Drawing.Image)(resources.GetObject("buttonSellers.Image")));
            this.buttonSellers.Location = new System.Drawing.Point(0, 155);
            this.buttonSellers.Name = "buttonSellers";
            this.buttonSellers.Size = new System.Drawing.Size(157, 71);
            this.buttonSellers.TabIndex = 4;
            this.buttonSellers.Text = "sellers";
            this.buttonSellers.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.buttonSellers.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            this.buttonSellers.UseVisualStyleBackColor = true;
            this.buttonSellers.Click += new System.EventHandler(this.buttonSellers_Click);
            // 
            // buttonDashborad
            // 
            this.buttonDashborad.FlatAppearance.BorderSize = 0;
            this.buttonDashborad.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.buttonDashborad.ForeColor = System.Drawing.Color.White;
            this.buttonDashborad.Image = ((System.Drawing.Image)(resources.GetObject("buttonDashborad.Image")));
            this.buttonDashborad.Location = new System.Drawing.Point(0, 94);
            this.buttonDashborad.Name = "buttonDashborad";
            this.buttonDashborad.Size = new System.Drawing.Size(157, 55);
            this.buttonDashborad.TabIndex = 3;
            this.buttonDashborad.Text = "Dashborad";
            this.buttonDashborad.TextAlign = System.Drawing.ContentAlignment.BottomCenter;
            this.buttonDashborad.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageAboveText;
            this.buttonDashborad.UseVisualStyleBackColor = true;
            this.buttonDashborad.Click += new System.EventHandler(this.button1_Click);
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.checkBox4);
            this.panel3.Controls.Add(this.checkBox3);
            this.panel3.Controls.Add(this.checkBox2);
            this.panel3.Controls.Add(this.checkBox1);
            this.panel3.Controls.Add(this.label4);
            this.panel3.Controls.Add(this.pictureBox3);
            this.panel3.Location = new System.Drawing.Point(166, 272);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(631, 178);
            this.panel3.TabIndex = 5;
            // 
            // pictureBox3
            // 
            this.pictureBox3.Image = global::practice01.Properties.Resources.bcc8f542_1af5_44c1_8d02_d7d5f3aab003;
            this.pictureBox3.Location = new System.Drawing.Point(3, 0);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(263, 172);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox3.TabIndex = 0;
            this.pictureBox3.TabStop = false;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("HY목각파임B", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label4.Location = new System.Drawing.Point(277, 14);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(75, 19);
            this.label4.TabIndex = 3;
            this.label4.Text = "Tasks";
            // 
            // checkBox1
            // 
            this.checkBox1.AutoSize = true;
            this.checkBox1.Location = new System.Drawing.Point(271, 39);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(170, 20);
            this.checkBox1.TabIndex = 4;
            this.checkBox1.Text = "Lorem ispum....";
            this.checkBox1.UseVisualStyleBackColor = true;
            // 
            // checkBox2
            // 
            this.checkBox2.AutoSize = true;
            this.checkBox2.Location = new System.Drawing.Point(271, 65);
            this.checkBox2.Name = "checkBox2";
            this.checkBox2.Size = new System.Drawing.Size(157, 20);
            this.checkBox2.TabIndex = 4;
            this.checkBox2.Text = "c# UI Deeping";
            this.checkBox2.UseVisualStyleBackColor = true;
            // 
            // checkBox3
            // 
            this.checkBox3.AutoSize = true;
            this.checkBox3.Location = new System.Drawing.Point(271, 91);
            this.checkBox3.Name = "checkBox3";
            this.checkBox3.Size = new System.Drawing.Size(140, 20);
            this.checkBox3.TabIndex = 4;
            this.checkBox3.Text = "By sellers...";
            this.checkBox3.UseVisualStyleBackColor = true;
            // 
            // checkBox4
            // 
            this.checkBox4.AutoSize = true;
            this.checkBox4.Location = new System.Drawing.Point(271, 117);
            this.checkBox4.Name = "checkBox4";
            this.checkBox4.Size = new System.Drawing.Size(165, 20);
            this.checkBox4.TabIndex = 4;
            this.checkBox4.Text = "C# UI Academy";
            this.checkBox4.UseVisualStyleBackColor = true;
            // 
            // panelLeft
            // 
            this.panelLeft.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(0)))));
            this.panelLeft.Location = new System.Drawing.Point(163, 94);
            this.panelLeft.Name = "panelLeft";
            this.panelLeft.Size = new System.Drawing.Size(10, 63);
            this.panelLeft.TabIndex = 6;
            this.panelLeft.Paint += new System.Windows.Forms.PaintEventHandler(this.panelLeft_Paint);
            // 
            // Form1
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(41)))), ((int)(((byte)(44)))), ((int)(((byte)(51)))));
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.panelLeft);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.button8);
            this.Controls.Add(this.button7);
            this.Controls.Add(this.button6);
            this.Controls.Add(this.button5);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.panel1);
            this.Font = new System.Drawing.Font("HY목각파임B", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(62)))), ((int)(((byte)(120)))), ((int)(((byte)(138)))));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.panel1.ResumeLayout(false);
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.panel3.ResumeLayout(false);
            this.panel3.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button buttonDashborad;
        private System.Windows.Forms.Button buttonTask;
        private System.Windows.Forms.Button buttonCalender;
        private System.Windows.Forms.Button buttonSellers;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Button button8;
        private System.Windows.Forms.Panel panel3;
        private System.Windows.Forms.CheckBox checkBox4;
        private System.Windows.Forms.CheckBox checkBox3;
        private System.Windows.Forms.CheckBox checkBox2;
        private System.Windows.Forms.CheckBox checkBox1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.Panel panelLeft;
    }
}

