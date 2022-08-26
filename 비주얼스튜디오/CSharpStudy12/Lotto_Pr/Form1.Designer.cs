namespace Lotto_Pr
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
            this.button1 = new System.Windows.Forms.Button();
            this.ball1 = new System.Windows.Forms.Label();
            this.ball2 = new System.Windows.Forms.Label();
            this.ball3 = new System.Windows.Forms.Label();
            this.ball4 = new System.Windows.Forms.Label();
            this.ball5 = new System.Windows.Forms.Label();
            this.ball6 = new System.Windows.Forms.Label();
            this.bonus = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox4 = new System.Windows.Forms.TextBox();
            this.textBox5 = new System.Windows.Forms.TextBox();
            this.textBox6 = new System.Windows.Forms.TextBox();
            this.textBox7 = new System.Windows.Forms.TextBox();
            this.result = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.button1.Location = new System.Drawing.Point(300, 274);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(189, 50);
            this.button1.TabIndex = 0;
            this.button1.Text = "Lotto 생성";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // ball1
            // 
            this.ball1.AutoSize = true;
            this.ball1.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball1.Location = new System.Drawing.Point(135, 210);
            this.ball1.Name = "ball1";
            this.ball1.Size = new System.Drawing.Size(48, 16);
            this.ball1.TabIndex = 1;
            this.ball1.Text = "label1";
            this.ball1.Click += new System.EventHandler(this.ball1_Click);
            // 
            // ball2
            // 
            this.ball2.AutoSize = true;
            this.ball2.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball2.Location = new System.Drawing.Point(220, 210);
            this.ball2.Name = "ball2";
            this.ball2.Size = new System.Drawing.Size(48, 16);
            this.ball2.TabIndex = 2;
            this.ball2.Text = "label2";
            // 
            // ball3
            // 
            this.ball3.AutoSize = true;
            this.ball3.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball3.Location = new System.Drawing.Point(311, 210);
            this.ball3.Name = "ball3";
            this.ball3.Size = new System.Drawing.Size(48, 16);
            this.ball3.TabIndex = 3;
            this.ball3.Text = "label3";
            // 
            // ball4
            // 
            this.ball4.AutoSize = true;
            this.ball4.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball4.Location = new System.Drawing.Point(399, 210);
            this.ball4.Name = "ball4";
            this.ball4.Size = new System.Drawing.Size(49, 16);
            this.ball4.TabIndex = 4;
            this.ball4.Text = "label4";
            // 
            // ball5
            // 
            this.ball5.AutoSize = true;
            this.ball5.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball5.Location = new System.Drawing.Point(481, 210);
            this.ball5.Name = "ball5";
            this.ball5.Size = new System.Drawing.Size(48, 16);
            this.ball5.TabIndex = 5;
            this.ball5.Text = "label5";
            // 
            // ball6
            // 
            this.ball6.AutoSize = true;
            this.ball6.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.ball6.Location = new System.Drawing.Point(559, 210);
            this.ball6.Name = "ball6";
            this.ball6.Size = new System.Drawing.Size(48, 16);
            this.ball6.TabIndex = 6;
            this.ball6.Text = "label6";
            // 
            // bonus
            // 
            this.bonus.AutoSize = true;
            this.bonus.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.bonus.Location = new System.Drawing.Point(638, 210);
            this.bonus.Name = "bonus";
            this.bonus.Size = new System.Drawing.Size(48, 16);
            this.bonus.TabIndex = 7;
            this.bonus.Text = "label7";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(138, 137);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(45, 21);
            this.textBox1.TabIndex = 8;
            this.textBox1.Text = "Ball 1";
            // 
            // textBox2
            // 
            this.textBox2.Location = new System.Drawing.Point(223, 137);
            this.textBox2.Name = "textBox2";
            this.textBox2.Size = new System.Drawing.Size(45, 21);
            this.textBox2.TabIndex = 8;
            this.textBox2.Text = "Ball 2";
            // 
            // textBox3
            // 
            this.textBox3.Location = new System.Drawing.Point(314, 137);
            this.textBox3.Name = "textBox3";
            this.textBox3.Size = new System.Drawing.Size(45, 21);
            this.textBox3.TabIndex = 8;
            this.textBox3.Text = "Ball 3";
            // 
            // textBox4
            // 
            this.textBox4.Location = new System.Drawing.Point(402, 137);
            this.textBox4.Name = "textBox4";
            this.textBox4.Size = new System.Drawing.Size(45, 21);
            this.textBox4.TabIndex = 8;
            this.textBox4.Text = "Ball 4";
            // 
            // textBox5
            // 
            this.textBox5.Location = new System.Drawing.Point(484, 137);
            this.textBox5.Name = "textBox5";
            this.textBox5.Size = new System.Drawing.Size(45, 21);
            this.textBox5.TabIndex = 8;
            this.textBox5.Text = "Ball 5";
            // 
            // textBox6
            // 
            this.textBox6.Location = new System.Drawing.Point(562, 137);
            this.textBox6.Name = "textBox6";
            this.textBox6.Size = new System.Drawing.Size(45, 21);
            this.textBox6.TabIndex = 8;
            this.textBox6.Text = "Ball 6";
            // 
            // textBox7
            // 
            this.textBox7.Location = new System.Drawing.Point(641, 137);
            this.textBox7.Name = "textBox7";
            this.textBox7.Size = new System.Drawing.Size(45, 21);
            this.textBox7.TabIndex = 8;
            this.textBox7.Text = "Bonus";
            // 
            // result
            // 
            this.result.Location = new System.Drawing.Point(138, 353);
            this.result.Name = "result";
            this.result.Size = new System.Drawing.Size(529, 21);
            this.result.TabIndex = 9;
            this.result.TextChanged += new System.EventHandler(this.result_TextChanged);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.result);
            this.Controls.Add(this.textBox7);
            this.Controls.Add(this.textBox6);
            this.Controls.Add(this.textBox5);
            this.Controls.Add(this.textBox4);
            this.Controls.Add(this.textBox3);
            this.Controls.Add(this.textBox2);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.bonus);
            this.Controls.Add(this.ball6);
            this.Controls.Add(this.ball5);
            this.Controls.Add(this.ball4);
            this.Controls.Add(this.ball3);
            this.Controls.Add(this.ball2);
            this.Controls.Add(this.ball1);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label ball1;
        private System.Windows.Forms.Label ball2;
        private System.Windows.Forms.Label ball3;
        private System.Windows.Forms.Label ball4;
        private System.Windows.Forms.Label ball5;
        private System.Windows.Forms.Label ball6;
        private System.Windows.Forms.Label bonus;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox3;
        private System.Windows.Forms.TextBox textBox4;
        private System.Windows.Forms.TextBox textBox5;
        private System.Windows.Forms.TextBox textBox6;
        private System.Windows.Forms.TextBox textBox7;
        private System.Windows.Forms.TextBox result;
    }
}

