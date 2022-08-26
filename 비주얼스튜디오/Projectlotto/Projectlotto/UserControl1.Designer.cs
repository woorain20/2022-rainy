namespace Projectlotto
{
    partial class Gameimg
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
            this.paper = new System.Windows.Forms.Label();
            this.seday = new System.Windows.Forms.Label();
            this.lotday = new System.Windows.Forms.Label();
            this.limday = new System.Windows.Forms.Label();
            this.panel1 = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // paper
            // 
            this.paper.AutoSize = true;
            this.paper.Font = new System.Drawing.Font("경기천년제목V Bold", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.paper.Location = new System.Drawing.Point(243, 14);
            this.paper.Name = "paper";
            this.paper.Size = new System.Drawing.Size(144, 27);
            this.paper.TabIndex = 2;
            this.paper.Text = "나눔 Lotto";
            // 
            // seday
            // 
            this.seday.AutoSize = true;
            this.seday.Font = new System.Drawing.Font("경기천년제목V Bold", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.seday.Location = new System.Drawing.Point(103, 58);
            this.seday.Name = "seday";
            this.seday.Size = new System.Drawing.Size(53, 15);
            this.seday.TabIndex = 3;
            this.seday.Text = "label1";
            // 
            // lotday
            // 
            this.lotday.AutoSize = true;
            this.lotday.Font = new System.Drawing.Font("경기천년제목V Bold", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.lotday.Location = new System.Drawing.Point(103, 84);
            this.lotday.Name = "lotday";
            this.lotday.Size = new System.Drawing.Size(53, 15);
            this.lotday.TabIndex = 3;
            this.lotday.Text = "label1";
            // 
            // limday
            // 
            this.limday.AutoSize = true;
            this.limday.Font = new System.Drawing.Font("경기천년제목V Bold", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.limday.Location = new System.Drawing.Point(103, 110);
            this.limday.Name = "limday";
            this.limday.Size = new System.Drawing.Size(53, 15);
            this.limday.TabIndex = 3;
            this.limday.Text = "label1";
            // 
            // panel1
            // 
            this.panel1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel1.Location = new System.Drawing.Point(0, 128);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(684, 274);
            this.panel1.TabIndex = 4;
            // 
            // Gameimg
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.limday);
            this.Controls.Add(this.lotday);
            this.Controls.Add(this.seday);
            this.Controls.Add(this.paper);
            this.Name = "Gameimg";
            this.Size = new System.Drawing.Size(684, 402);
            this.Load += new System.EventHandler(this.Gameimg_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label paper;
        private System.Windows.Forms.Label seday;
        private System.Windows.Forms.Label lotday;
        private System.Windows.Forms.Label limday;
        private System.Windows.Forms.Panel panel1;
    }
}
