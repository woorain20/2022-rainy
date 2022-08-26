namespace Lotto
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
            this.panel2 = new System.Windows.Forms.Panel();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.homeB = new System.Windows.Forms.Button();
            this.makeB = new System.Windows.Forms.Button();
            this.RecodeB = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.button3 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.href = new System.Windows.Forms.Button();
            this.panel3 = new System.Windows.Forms.Panel();
            this.backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            this.backgroundWorker2 = new System.ComponentModel.BackgroundWorker();
            this.backgroundWorker3 = new System.ComponentModel.BackgroundWorker();
            this.userControl11 = new Lotto.UserControl1();
            this.userControl22 = new Lotto.UserControl2();
            this.panel2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.panel1.SuspendLayout();
            this.panel3.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.pictureBox2);
            this.panel2.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel2.Location = new System.Drawing.Point(0, 0);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(951, 107);
            this.panel2.TabIndex = 1;
            // 
            // pictureBox2
            // 
            this.pictureBox2.BackColor = System.Drawing.Color.White;
            this.pictureBox2.Image = global::Lotto.Properties.Resources.lottologo;
            this.pictureBox2.Location = new System.Drawing.Point(3, 0);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(945, 104);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox2.TabIndex = 2;
            this.pictureBox2.TabStop = false;
            // 
            // homeB
            // 
            this.homeB.Image = ((System.Drawing.Image)(resources.GetObject("homeB.Image")));
            this.homeB.ImageAlign = System.Drawing.ContentAlignment.MiddleLeft;
            this.homeB.Location = new System.Drawing.Point(0, 24);
            this.homeB.Name = "homeB";
            this.homeB.Size = new System.Drawing.Size(200, 73);
            this.homeB.TabIndex = 0;
            this.homeB.Text = "HOME";
            this.homeB.UseVisualStyleBackColor = true;
            // 
            // makeB
            // 
            this.makeB.Location = new System.Drawing.Point(0, 129);
            this.makeB.Name = "makeB";
            this.makeB.Size = new System.Drawing.Size(200, 73);
            this.makeB.TabIndex = 0;
            this.makeB.Text = "Lotto Make";
            this.makeB.UseVisualStyleBackColor = true;
            this.makeB.Click += new System.EventHandler(this.makeB_Click);
            // 
            // RecodeB
            // 
            this.RecodeB.Location = new System.Drawing.Point(0, 233);
            this.RecodeB.Name = "RecodeB";
            this.RecodeB.Size = new System.Drawing.Size(200, 73);
            this.RecodeB.TabIndex = 0;
            this.RecodeB.Text = "Recode";
            this.RecodeB.UseVisualStyleBackColor = true;
            this.RecodeB.Click += new System.EventHandler(this.RecodeB_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.homeB);
            this.panel1.Controls.Add(this.makeB);
            this.panel1.Controls.Add(this.button3);
            this.panel1.Controls.Add(this.button2);
            this.panel1.Controls.Add(this.href);
            this.panel1.Controls.Add(this.RecodeB);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Left;
            this.panel1.Location = new System.Drawing.Point(0, 107);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(200, 447);
            this.panel1.TabIndex = 3;
            // 
            // button3
            // 
            this.button3.Image = ((System.Drawing.Image)(resources.GetObject("button3.Image")));
            this.button3.Location = new System.Drawing.Point(153, 408);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(41, 36);
            this.button3.TabIndex = 0;
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button2
            // 
            this.button2.Image = ((System.Drawing.Image)(resources.GetObject("button2.Image")));
            this.button2.Location = new System.Drawing.Point(3, 408);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(41, 36);
            this.button2.TabIndex = 0;
            this.button2.UseVisualStyleBackColor = true;
            // 
            // href
            // 
            this.href.Image = ((System.Drawing.Image)(resources.GetObject("href.Image")));
            this.href.Location = new System.Drawing.Point(3, 408);
            this.href.Name = "href";
            this.href.Size = new System.Drawing.Size(41, 36);
            this.href.TabIndex = 0;
            this.href.UseVisualStyleBackColor = true;
            // 
            // panel3
            // 
            this.panel3.Controls.Add(this.userControl22);
            this.panel3.Controls.Add(this.userControl11);
            this.panel3.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel3.Location = new System.Drawing.Point(200, 131);
            this.panel3.Name = "panel3";
            this.panel3.Size = new System.Drawing.Size(751, 423);
            this.panel3.TabIndex = 4;
            // 
            // userControl11
            // 
            this.userControl11.BackColor = System.Drawing.Color.White;
            this.userControl11.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this.userControl11.Location = new System.Drawing.Point(0, 0);
            this.userControl11.Name = "userControl11";
            this.userControl11.Size = new System.Drawing.Size(751, 423);
            this.userControl11.TabIndex = 0;
            // 
            // userControl22
            // 
            this.userControl22.Location = new System.Drawing.Point(0, 0);
            this.userControl22.Name = "userControl22";
            this.userControl22.Size = new System.Drawing.Size(751, 423);
            this.userControl22.TabIndex = 1;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(951, 554);
            this.Controls.Add(this.panel3);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.panel2);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.Text = "Form1";
            this.panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.panel1.ResumeLayout(false);
            this.panel3.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button RecodeB;
        private System.Windows.Forms.Button makeB;
        private System.Windows.Forms.Button homeB;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Button href;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Panel panel3;
        private UserControl2 userControl21;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private System.ComponentModel.BackgroundWorker backgroundWorker2;
        private System.ComponentModel.BackgroundWorker backgroundWorker3;
        private UserControl1 userControl11;
        private UserControl2 userControl22;
    }
}

