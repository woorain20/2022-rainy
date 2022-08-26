namespace CSharpStudy12
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
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.myButton = new System.Windows.Forms.Button();
            this.Label_Random = new System.Windows.Forms.Label();
            this.label_myrandom = new System.Windows.Forms.Label();
            this.button_random = new System.Windows.Forms.Button();
            this.label_r = new System.Windows.Forms.Label();
            this.label_r2 = new System.Windows.Forms.Label();
            this.label_r3 = new System.Windows.Forms.Label();
            this.label_r4 = new System.Windows.Forms.Label();
            this.label_r5 = new System.Windows.Forms.Label();
            this.label_r6 = new System.Windows.Forms.Label();
            this.label_r7 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(698, 77);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(90, 43);
            this.button1.TabIndex = 0;
            this.button1.Text = "button1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(635, 12);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(62, 48);
            this.button2.TabIndex = 1;
            this.button2.Text = "NAVER";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.FlatAppearance.BorderSize = 0;
            this.button3.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button3.Image = ((System.Drawing.Image)(resources.GetObject("button3.Image")));
            this.button3.Location = new System.Drawing.Point(713, 12);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(75, 48);
            this.button3.TabIndex = 2;
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // myButton
            // 
            this.myButton.Location = new System.Drawing.Point(698, 137);
            this.myButton.Name = "myButton";
            this.myButton.Size = new System.Drawing.Size(90, 46);
            this.myButton.TabIndex = 3;
            this.myButton.Text = "button4";
            this.myButton.UseVisualStyleBackColor = true;
            this.myButton.Click += new System.EventHandler(this.myButton_Click);
            // 
            // Label_Random
            // 
            this.Label_Random.AutoSize = true;
            this.Label_Random.Font = new System.Drawing.Font("굴림", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Label_Random.Location = new System.Drawing.Point(722, 200);
            this.Label_Random.Name = "Label_Random";
            this.Label_Random.Size = new System.Drawing.Size(48, 16);
            this.Label_Random.TabIndex = 4;
            this.Label_Random.Text = "label1";
            this.Label_Random.Click += new System.EventHandler(this.Label_Random_Click);
            // 
            // label_myrandom
            // 
            this.label_myrandom.AutoSize = true;
            this.label_myrandom.Font = new System.Drawing.Font("Elephant", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_myrandom.Location = new System.Drawing.Point(12, 9);
            this.label_myrandom.Name = "label_myrandom";
            this.label_myrandom.Size = new System.Drawing.Size(93, 25);
            this.label_myrandom.TabIndex = 5;
            this.label_myrandom.Text = "Random";
            this.label_myrandom.Click += new System.EventHandler(this.label_myrandom_Click);
            // 
            // button_random
            // 
            this.button_random.FlatAppearance.BorderSize = 0;
            this.button_random.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_random.Image = ((System.Drawing.Image)(resources.GetObject("button_random.Image")));
            this.button_random.Location = new System.Drawing.Point(17, 37);
            this.button_random.Name = "button_random";
            this.button_random.Size = new System.Drawing.Size(62, 48);
            this.button_random.TabIndex = 6;
            this.button_random.UseVisualStyleBackColor = true;
            this.button_random.Click += new System.EventHandler(this.button_random_Click);
            // 
            // label_r
            // 
            this.label_r.AutoSize = true;
            this.label_r.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r.Location = new System.Drawing.Point(35, 92);
            this.label_r.Name = "label_r";
            this.label_r.Size = new System.Drawing.Size(45, 15);
            this.label_r.TabIndex = 7;
            this.label_r.Text = "label1";
            this.label_r.Click += new System.EventHandler(this.label1_Click);
            // 
            // label_r2
            // 
            this.label_r2.AutoSize = true;
            this.label_r2.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r2.Location = new System.Drawing.Point(35, 121);
            this.label_r2.Name = "label_r2";
            this.label_r2.Size = new System.Drawing.Size(45, 15);
            this.label_r2.TabIndex = 8;
            this.label_r2.Text = "label1";
            this.label_r2.Click += new System.EventHandler(this.label_r2_Click);
            // 
            // label_r3
            // 
            this.label_r3.AutoSize = true;
            this.label_r3.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r3.Location = new System.Drawing.Point(35, 151);
            this.label_r3.Name = "label_r3";
            this.label_r3.Size = new System.Drawing.Size(45, 15);
            this.label_r3.TabIndex = 9;
            this.label_r3.Text = "label1";
            // 
            // label_r4
            // 
            this.label_r4.AutoSize = true;
            this.label_r4.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r4.Location = new System.Drawing.Point(34, 181);
            this.label_r4.Name = "label_r4";
            this.label_r4.Size = new System.Drawing.Size(45, 15);
            this.label_r4.TabIndex = 10;
            this.label_r4.Text = "label2";
            // 
            // label_r5
            // 
            this.label_r5.AutoSize = true;
            this.label_r5.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r5.Location = new System.Drawing.Point(35, 212);
            this.label_r5.Name = "label_r5";
            this.label_r5.Size = new System.Drawing.Size(45, 15);
            this.label_r5.TabIndex = 11;
            this.label_r5.Text = "label1";
            // 
            // label_r6
            // 
            this.label_r6.AutoSize = true;
            this.label_r6.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r6.Location = new System.Drawing.Point(34, 243);
            this.label_r6.Name = "label_r6";
            this.label_r6.Size = new System.Drawing.Size(45, 15);
            this.label_r6.TabIndex = 12;
            this.label_r6.Text = "label1";
            // 
            // label_r7
            // 
            this.label_r7.AutoSize = true;
            this.label_r7.Font = new System.Drawing.Font("굴림", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label_r7.Location = new System.Drawing.Point(34, 273);
            this.label_r7.Name = "label_r7";
            this.label_r7.Size = new System.Drawing.Size(45, 15);
            this.label_r7.TabIndex = 13;
            this.label_r7.Text = "label1";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label_r7);
            this.Controls.Add(this.label_r6);
            this.Controls.Add(this.label_r5);
            this.Controls.Add(this.label_r4);
            this.Controls.Add(this.label_r3);
            this.Controls.Add(this.label_r2);
            this.Controls.Add(this.label_r);
            this.Controls.Add(this.button_random);
            this.Controls.Add(this.label_myrandom);
            this.Controls.Add(this.Label_Random);
            this.Controls.Add(this.myButton);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button myButton;
        private System.Windows.Forms.Label Label_Random;
        private System.Windows.Forms.Label label_myrandom;
        private System.Windows.Forms.Button button_random;
        private System.Windows.Forms.Label label_r;
        private System.Windows.Forms.Label label_r2;
        private System.Windows.Forms.Label label_r3;
        private System.Windows.Forms.Label label_r4;
        private System.Windows.Forms.Label label_r5;
        private System.Windows.Forms.Label label_r6;
        private System.Windows.Forms.Label label_r7;
    }
}

