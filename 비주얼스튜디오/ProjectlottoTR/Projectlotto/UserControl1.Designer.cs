namespace Projectlotto
{
    partial class record
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
            this.rtitle = new System.Windows.Forms.Label();
            this.rbutton = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // rtitle
            // 
            this.rtitle.AutoSize = true;
            this.rtitle.Font = new System.Drawing.Font("경기천년제목V Bold", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.rtitle.Location = new System.Drawing.Point(212, 43);
            this.rtitle.Name = "rtitle";
            this.rtitle.Size = new System.Drawing.Size(238, 24);
            this.rtitle.TabIndex = 0;
            this.rtitle.Text = "회차별 당첨번호 조회";
            // 
            // rbutton
            // 
            this.rbutton.Font = new System.Drawing.Font("경기천년제목V Bold", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.rbutton.Location = new System.Drawing.Point(251, 359);
            this.rbutton.Name = "rbutton";
            this.rbutton.Size = new System.Drawing.Size(182, 40);
            this.rbutton.TabIndex = 1;
            this.rbutton.Text = "지난 회차 보기";
            this.rbutton.UseVisualStyleBackColor = true;
            this.rbutton.Click += new System.EventHandler(this.rbutton_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::Projectlotto.Properties.Resources._111;
            this.pictureBox1.Location = new System.Drawing.Point(0, 81);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(681, 272);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pictureBox1.TabIndex = 2;
            this.pictureBox1.TabStop = false;
            // 
            // record
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.rbutton);
            this.Controls.Add(this.rtitle);
            this.Name = "record";
            this.Size = new System.Drawing.Size(684, 402);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label rtitle;
        private System.Windows.Forms.Button rbutton;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label1;
    }
}
