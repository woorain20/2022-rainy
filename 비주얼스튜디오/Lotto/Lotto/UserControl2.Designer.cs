namespace Lotto
{
    partial class UserControl2
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
            this.panel1 = new System.Windows.Forms.Panel();
            this.lookup = new System.Windows.Forms.Button();
            this.panel2 = new System.Windows.Forms.Panel();
            this.looktitle = new System.Windows.Forms.Label();
            this.panel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.looktitle);
            this.panel1.Dock = System.Windows.Forms.DockStyle.Top;
            this.panel1.Location = new System.Drawing.Point(0, 0);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(751, 49);
            this.panel1.TabIndex = 0;
            // 
            // lookup
            // 
            this.lookup.Location = new System.Drawing.Point(673, 55);
            this.lookup.Name = "lookup";
            this.lookup.Size = new System.Drawing.Size(75, 23);
            this.lookup.TabIndex = 1;
            this.lookup.Text = "조회";
            this.lookup.UseVisualStyleBackColor = true;
            this.lookup.Click += new System.EventHandler(this.lookup_Click);
            // 
            // panel2
            // 
            this.panel2.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.panel2.Location = new System.Drawing.Point(0, 84);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(751, 339);
            this.panel2.TabIndex = 2;
            // 
            // looktitle
            // 
            this.looktitle.AutoSize = true;
            this.looktitle.Font = new System.Drawing.Font("굴림", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.looktitle.Location = new System.Drawing.Point(247, 17);
            this.looktitle.Name = "looktitle";
            this.looktitle.Size = new System.Drawing.Size(202, 21);
            this.looktitle.TabIndex = 0;
            this.looktitle.Text = "역대 당첨번호 조회";
            this.looktitle.Click += new System.EventHandler(this.looktitle_Click);
            // 
            // UserControl2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.lookup);
            this.Controls.Add(this.panel1);
            this.Name = "UserControl2";
            this.Size = new System.Drawing.Size(751, 423);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Button lookup;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label looktitle;
    }
}
