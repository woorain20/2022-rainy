namespace Lotto
{
    partial class UserControl1
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

        #region 구성 요소 디자이너에서 생성한 코드

        /// <summary> 
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(UserControl1));
            this.lottobt = new System.Windows.Forms.Button();
            this.ball1 = new System.Windows.Forms.Label();
            this.ball2 = new System.Windows.Forms.Label();
            this.ball3 = new System.Windows.Forms.Label();
            this.ball4 = new System.Windows.Forms.Label();
            this.ball5 = new System.Windows.Forms.Label();
            this.ball6 = new System.Windows.Forms.Label();
            this.bonus = new System.Windows.Forms.Label();
            this.num = new System.Windows.Forms.TextBox();
            this.num2 = new System.Windows.Forms.TextBox();
            this.b1 = new System.Windows.Forms.Label();
            this.b2 = new System.Windows.Forms.Label();
            this.b3 = new System.Windows.Forms.Label();
            this.b4 = new System.Windows.Forms.Label();
            this.b5 = new System.Windows.Forms.Label();
            this.b6 = new System.Windows.Forms.Label();
            this.bb = new System.Windows.Forms.Label();
            this.makedate = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lottobt
            // 
            this.lottobt.Location = new System.Drawing.Point(595, 133);
            this.lottobt.Name = "lottobt";
            this.lottobt.Size = new System.Drawing.Size(73, 63);
            this.lottobt.TabIndex = 0;
            this.lottobt.Text = "번호 생성";
            this.lottobt.UseVisualStyleBackColor = true;
            this.lottobt.Click += new System.EventHandler(this.lottobt_Click);
            // 
            // ball1
            // 
            this.ball1.AutoSize = true;
            this.ball1.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball1.Location = new System.Drawing.Point(65, 149);
            this.ball1.Name = "ball1";
            this.ball1.Size = new System.Drawing.Size(65, 23);
            this.ball1.TabIndex = 1;
            this.ball1.Text = "label1";
            // 
            // ball2
            // 
            this.ball2.AutoSize = true;
            this.ball2.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball2.Location = new System.Drawing.Point(136, 149);
            this.ball2.Name = "ball2";
            this.ball2.Size = new System.Drawing.Size(65, 23);
            this.ball2.TabIndex = 1;
            this.ball2.Text = "label1";
            // 
            // ball3
            // 
            this.ball3.AutoSize = true;
            this.ball3.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball3.Location = new System.Drawing.Point(207, 149);
            this.ball3.Name = "ball3";
            this.ball3.Size = new System.Drawing.Size(65, 23);
            this.ball3.TabIndex = 1;
            this.ball3.Text = "label1";
            // 
            // ball4
            // 
            this.ball4.AutoSize = true;
            this.ball4.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball4.Location = new System.Drawing.Point(278, 149);
            this.ball4.Name = "ball4";
            this.ball4.Size = new System.Drawing.Size(65, 23);
            this.ball4.TabIndex = 1;
            this.ball4.Text = "label1";
            // 
            // ball5
            // 
            this.ball5.AutoSize = true;
            this.ball5.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball5.Location = new System.Drawing.Point(349, 149);
            this.ball5.Name = "ball5";
            this.ball5.Size = new System.Drawing.Size(65, 23);
            this.ball5.TabIndex = 1;
            this.ball5.Text = "label1";
            // 
            // ball6
            // 
            this.ball6.AutoSize = true;
            this.ball6.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ball6.Location = new System.Drawing.Point(420, 149);
            this.ball6.Name = "ball6";
            this.ball6.Size = new System.Drawing.Size(65, 23);
            this.ball6.TabIndex = 1;
            this.ball6.Text = "label1";
            // 
            // bonus
            // 
            this.bonus.AutoSize = true;
            this.bonus.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.bonus.Location = new System.Drawing.Point(491, 149);
            this.bonus.Name = "bonus";
            this.bonus.Size = new System.Drawing.Size(65, 23);
            this.bonus.TabIndex = 1;
            this.bonus.Text = "label1";
            // 
            // num
            // 
            this.num.BackColor = System.Drawing.Color.White;
            this.num.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.num.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.num.Location = new System.Drawing.Point(211, 297);
            this.num.Name = "num";
            this.num.Size = new System.Drawing.Size(115, 25);
            this.num.TabIndex = 2;
            this.num.Text = "당첨 번호";
            // 
            // num2
            // 
            this.num2.BackColor = System.Drawing.Color.White;
            this.num2.BorderStyle = System.Windows.Forms.BorderStyle.None;
            this.num2.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.num2.Location = new System.Drawing.Point(556, 297);
            this.num2.Name = "num2";
            this.num2.Size = new System.Drawing.Size(143, 25);
            this.num2.TabIndex = 2;
            this.num2.Text = "보너스 번호";
            // 
            // b1
            // 
            this.b1.AutoSize = true;
            this.b1.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b1.Location = new System.Drawing.Point(30, 352);
            this.b1.Name = "b1";
            this.b1.Size = new System.Drawing.Size(65, 23);
            this.b1.TabIndex = 1;
            this.b1.Text = "label1";
            // 
            // b2
            // 
            this.b2.AutoSize = true;
            this.b2.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b2.Location = new System.Drawing.Point(110, 352);
            this.b2.Name = "b2";
            this.b2.Size = new System.Drawing.Size(65, 23);
            this.b2.TabIndex = 1;
            this.b2.Text = "label1";
            // 
            // b3
            // 
            this.b3.AutoSize = true;
            this.b3.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b3.Location = new System.Drawing.Point(197, 352);
            this.b3.Name = "b3";
            this.b3.Size = new System.Drawing.Size(65, 23);
            this.b3.TabIndex = 1;
            this.b3.Text = "label1";
            // 
            // b4
            // 
            this.b4.AutoSize = true;
            this.b4.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b4.Location = new System.Drawing.Point(278, 352);
            this.b4.Name = "b4";
            this.b4.Size = new System.Drawing.Size(65, 23);
            this.b4.TabIndex = 1;
            this.b4.Text = "label1";
            // 
            // b5
            // 
            this.b5.AutoSize = true;
            this.b5.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b5.Location = new System.Drawing.Point(359, 352);
            this.b5.Name = "b5";
            this.b5.Size = new System.Drawing.Size(65, 23);
            this.b5.TabIndex = 1;
            this.b5.Text = "label1";
            // 
            // b6
            // 
            this.b6.AutoSize = true;
            this.b6.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.b6.Location = new System.Drawing.Point(442, 352);
            this.b6.Name = "b6";
            this.b6.Size = new System.Drawing.Size(65, 23);
            this.b6.TabIndex = 1;
            this.b6.Text = "label1";
            // 
            // bb
            // 
            this.bb.AutoSize = true;
            this.bb.Font = new System.Drawing.Font("Century Schoolbook", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.bb.Location = new System.Drawing.Point(591, 352);
            this.bb.Name = "bb";
            this.bb.Size = new System.Drawing.Size(65, 23);
            this.bb.TabIndex = 1;
            this.bb.Text = "label1";
            this.bb.Click += new System.EventHandler(this.label8_Click);
            // 
            // makedate
            // 
            this.makedate.AutoSize = true;
            this.makedate.Font = new System.Drawing.Font("굴림", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.makedate.Location = new System.Drawing.Point(335, 222);
            this.makedate.Name = "makedate";
            this.makedate.Size = new System.Drawing.Size(44, 13);
            this.makedate.TabIndex = 4;
            this.makedate.Text = "label1";
            this.makedate.Click += new System.EventHandler(this.makedate_Click);
            // 
            // panel1
            // 
            this.panel1.BackColor = System.Drawing.Color.White;
            this.panel1.Controls.Add(this.label1);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(751, 100);
            this.panel1.TabIndex = 5;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Century Schoolbook", 24F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(249, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(236, 37);
            this.label1.TabIndex = 1;
            this.label1.Text = "로또 번호 자동 생성";
            // 
            // button1
            // 
            this.button1.FlatAppearance.BorderSize = 0;
            this.button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button1.Image = ((System.Drawing.Image)(resources.GetObject("button1.Image")));
            this.button1.Location = new System.Drawing.Point(528, 343);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(45, 40);
            this.button1.TabIndex = 0;
            this.button1.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("굴림", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label2.Location = new System.Drawing.Point(253, 222);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "생성: ";
            this.label2.Click += new System.EventHandler(this.makedate_Click);
            // 
            // UserControl1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.makedate);
            this.Controls.Add(this.num2);
            this.Controls.Add(this.num);
            this.Controls.Add(this.bonus);
            this.Controls.Add(this.ball6);
            this.Controls.Add(this.ball5);
            this.Controls.Add(this.ball4);
            this.Controls.Add(this.ball3);
            this.Controls.Add(this.ball2);
            this.Controls.Add(this.bb);
            this.Controls.Add(this.b6);
            this.Controls.Add(this.b5);
            this.Controls.Add(this.b4);
            this.Controls.Add(this.b3);
            this.Controls.Add(this.b2);
            this.Controls.Add(this.b1);
            this.Controls.Add(this.ball1);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.lottobt);
            this.DoubleBuffered = true;
            this.Name = "UserControl1";
            this.Size = new System.Drawing.Size(751, 423);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button lottobt;
        private System.Windows.Forms.Label ball1;
        private System.Windows.Forms.Label ball2;
        private System.Windows.Forms.Label ball3;
        private System.Windows.Forms.Label ball4;
        private System.Windows.Forms.Label ball5;
        private System.Windows.Forms.Label ball6;
        private System.Windows.Forms.Label bonus;
        private System.Windows.Forms.TextBox num;
        private System.Windows.Forms.TextBox num2;
        private System.Windows.Forms.Label b1;
        private System.Windows.Forms.Label b2;
        private System.Windows.Forms.Label b3;
        private System.Windows.Forms.Label b4;
        private System.Windows.Forms.Label b5;
        private System.Windows.Forms.Label b6;
        private System.Windows.Forms.Label bb;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label makedate;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
    }
}
