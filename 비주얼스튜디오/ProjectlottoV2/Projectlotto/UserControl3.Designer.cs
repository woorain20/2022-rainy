﻿namespace Projectlotto
{
    partial class Recordimg
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
            this.rb = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // rtitle
            // 
            this.rtitle.AutoSize = true;
            this.rtitle.Font = new System.Drawing.Font("경기천년제목V Bold", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.rtitle.Location = new System.Drawing.Point(228, 35);
            this.rtitle.Name = "rtitle";
            this.rtitle.Size = new System.Drawing.Size(181, 27);
            this.rtitle.TabIndex = 0;
            this.rtitle.Text = "역대 당첨번호";
            // 
            // rb
            // 
            this.rb.Font = new System.Drawing.Font("경기천년제목V Bold", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.rb.Location = new System.Drawing.Point(574, 71);
            this.rb.Name = "rb";
            this.rb.Size = new System.Drawing.Size(79, 28);
            this.rb.TabIndex = 1;
            this.rb.Text = "조회";
            this.rb.UseVisualStyleBackColor = true;
            // 
            // panel1
            // 
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Location = new System.Drawing.Point(0, 105);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(684, 297);
            this.panel1.TabIndex = 2;
            // 
            // Recordimg
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.rb);
            this.Controls.Add(this.rtitle);
            this.Name = "Recordimg";
            this.Size = new System.Drawing.Size(684, 402);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label rtitle;
        private System.Windows.Forms.Button rb;
        private System.Windows.Forms.Panel panel1;
    }
}
