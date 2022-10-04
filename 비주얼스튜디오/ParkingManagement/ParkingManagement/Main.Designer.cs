namespace ParkingManagement
{
    partial class Main
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
            this.components = new System.ComponentModel.Container();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.button_remove = new System.Windows.Forms.Button();
            this.button_parking = new System.Windows.Forms.Button();
            this.textBox_phoneNum = new System.Windows.Forms.TextBox();
            this.textBox_driverName = new System.Windows.Forms.TextBox();
            this.textBox_carNum = new System.Windows.Forms.TextBox();
            this.textBox_parkingSpot = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.button_refresh = new System.Windows.Forms.Button();
            this.button_delete = new System.Windows.Forms.Button();
            this.button_add = new System.Windows.Forms.Button();
            this.button_find = new System.Windows.Forms.Button();
            this.textBox_findNum = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.textBox_findCost = new System.Windows.Forms.TextBox();
            this.button_findCost = new System.Windows.Forms.Button();
            this.textBox_costSpot = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.dataGridView_parkingManagement = new System.Windows.Forms.DataGridView();
            this.listBox_log = new System.Windows.Forms.ListBox();
            this.label_timeNow = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.groupBox4.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_parkingManagement)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.button_remove);
            this.groupBox1.Controls.Add(this.button_parking);
            this.groupBox1.Controls.Add(this.textBox_phoneNum);
            this.groupBox1.Controls.Add(this.textBox_driverName);
            this.groupBox1.Controls.Add(this.textBox_carNum);
            this.groupBox1.Controls.Add(this.textBox_parkingSpot);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(26, 26);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(267, 162);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "주차/출차";
            // 
            // button_remove
            // 
            this.button_remove.Location = new System.Drawing.Point(186, 85);
            this.button_remove.Name = "button_remove";
            this.button_remove.Size = new System.Drawing.Size(75, 23);
            this.button_remove.TabIndex = 9;
            this.button_remove.Text = "출차";
            this.button_remove.UseVisualStyleBackColor = true;
            this.button_remove.Click += new System.EventHandler(this.button_remove_Click);
            // 
            // button_parking
            // 
            this.button_parking.Location = new System.Drawing.Point(186, 29);
            this.button_parking.Name = "button_parking";
            this.button_parking.Size = new System.Drawing.Size(75, 23);
            this.button_parking.TabIndex = 8;
            this.button_parking.Text = "주차";
            this.button_parking.UseVisualStyleBackColor = true;
            this.button_parking.Click += new System.EventHandler(this.button1_Click);
            // 
            // textBox_phoneNum
            // 
            this.textBox_phoneNum.Location = new System.Drawing.Point(65, 121);
            this.textBox_phoneNum.Name = "textBox_phoneNum";
            this.textBox_phoneNum.Size = new System.Drawing.Size(100, 21);
            this.textBox_phoneNum.TabIndex = 7;
            // 
            // textBox_driverName
            // 
            this.textBox_driverName.Location = new System.Drawing.Point(65, 91);
            this.textBox_driverName.Name = "textBox_driverName";
            this.textBox_driverName.Size = new System.Drawing.Size(100, 21);
            this.textBox_driverName.TabIndex = 6;
            // 
            // textBox_carNum
            // 
            this.textBox_carNum.Location = new System.Drawing.Point(65, 61);
            this.textBox_carNum.Name = "textBox_carNum";
            this.textBox_carNum.Size = new System.Drawing.Size(100, 21);
            this.textBox_carNum.TabIndex = 5;
            // 
            // textBox_parkingSpot
            // 
            this.textBox_parkingSpot.Location = new System.Drawing.Point(65, 31);
            this.textBox_parkingSpot.Name = "textBox_parkingSpot";
            this.textBox_parkingSpot.Size = new System.Drawing.Size(100, 21);
            this.textBox_parkingSpot.TabIndex = 4;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(7, 124);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "전화번호";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(7, 96);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "차주이름";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(7, 64);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "차량번호";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(7, 34);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "공간번호";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.button_refresh);
            this.groupBox2.Controls.Add(this.button_delete);
            this.groupBox2.Controls.Add(this.button_add);
            this.groupBox2.Controls.Add(this.button_find);
            this.groupBox2.Controls.Add(this.textBox_findNum);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Location = new System.Drawing.Point(320, 26);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(217, 162);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "주차공간 현황 관리";
            // 
            // button_refresh
            // 
            this.button_refresh.Location = new System.Drawing.Point(126, 125);
            this.button_refresh.Name = "button_refresh";
            this.button_refresh.Size = new System.Drawing.Size(75, 23);
            this.button_refresh.TabIndex = 14;
            this.button_refresh.Text = "전체 갱신";
            this.button_refresh.UseVisualStyleBackColor = true;
            this.button_refresh.Click += new System.EventHandler(this.button_refresh_Click_1);
            // 
            // button_delete
            // 
            this.button_delete.Location = new System.Drawing.Point(126, 93);
            this.button_delete.Name = "button_delete";
            this.button_delete.Size = new System.Drawing.Size(75, 23);
            this.button_delete.TabIndex = 13;
            this.button_delete.Text = "공간 삭제";
            this.button_delete.UseVisualStyleBackColor = true;
            this.button_delete.Click += new System.EventHandler(this.button_delete_Click_1);
            // 
            // button_add
            // 
            this.button_add.Location = new System.Drawing.Point(126, 61);
            this.button_add.Name = "button_add";
            this.button_add.Size = new System.Drawing.Size(75, 23);
            this.button_add.TabIndex = 12;
            this.button_add.Text = "공간 추가";
            this.button_add.UseVisualStyleBackColor = true;
            this.button_add.Click += new System.EventHandler(this.button_add_Click_1);
            // 
            // button_find
            // 
            this.button_find.Location = new System.Drawing.Point(126, 29);
            this.button_find.Name = "button_find";
            this.button_find.Size = new System.Drawing.Size(75, 23);
            this.button_find.TabIndex = 11;
            this.button_find.Text = "공간 조회";
            this.button_find.UseVisualStyleBackColor = true;
            this.button_find.Click += new System.EventHandler(this.button_find_Click_1);
            // 
            // textBox_findNum
            // 
            this.textBox_findNum.Location = new System.Drawing.Point(6, 74);
            this.textBox_findNum.Name = "textBox_findNum";
            this.textBox_findNum.Size = new System.Drawing.Size(100, 21);
            this.textBox_findNum.TabIndex = 10;
            this.textBox_findNum.TextChanged += new System.EventHandler(this.textBox5_TextChanged);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(30, 49);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 12);
            this.label5.TabIndex = 10;
            this.label5.Text = "공간번호";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.textBox_findCost);
            this.groupBox3.Controls.Add(this.button_findCost);
            this.groupBox3.Controls.Add(this.textBox_costSpot);
            this.groupBox3.Controls.Add(this.label6);
            this.groupBox3.Location = new System.Drawing.Point(560, 26);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(204, 162);
            this.groupBox3.TabIndex = 1;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "요금 조회";
            // 
            // textBox_findCost
            // 
            this.textBox_findCost.Location = new System.Drawing.Point(21, 121);
            this.textBox_findCost.Name = "textBox_findCost";
            this.textBox_findCost.Size = new System.Drawing.Size(153, 21);
            this.textBox_findCost.TabIndex = 17;
            // 
            // button_findCost
            // 
            this.button_findCost.Location = new System.Drawing.Point(59, 85);
            this.button_findCost.Name = "button_findCost";
            this.button_findCost.Size = new System.Drawing.Size(75, 23);
            this.button_findCost.TabIndex = 15;
            this.button_findCost.Text = "요금 조회";
            this.button_findCost.UseVisualStyleBackColor = true;
            this.button_findCost.Click += new System.EventHandler(this.button_findCost_Click);
            // 
            // textBox_costSpot
            // 
            this.textBox_costSpot.Location = new System.Drawing.Point(21, 53);
            this.textBox_costSpot.Name = "textBox_costSpot";
            this.textBox_costSpot.Size = new System.Drawing.Size(153, 21);
            this.textBox_costSpot.TabIndex = 16;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(68, 29);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(53, 12);
            this.label6.TabIndex = 15;
            this.label6.Text = "공간번호";
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.dataGridView_parkingManagement);
            this.groupBox4.Location = new System.Drawing.Point(26, 216);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(738, 221);
            this.groupBox4.TabIndex = 1;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "주차 현황";
            // 
            // dataGridView_parkingManagement
            // 
            this.dataGridView_parkingManagement.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_parkingManagement.Location = new System.Drawing.Point(1, 20);
            this.dataGridView_parkingManagement.Name = "dataGridView_parkingManagement";
            this.dataGridView_parkingManagement.RowTemplate.Height = 23;
            this.dataGridView_parkingManagement.Size = new System.Drawing.Size(736, 201);
            this.dataGridView_parkingManagement.TabIndex = 0;
            this.dataGridView_parkingManagement.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView_parkingManagement_CellContentClick);
            // 
            // listBox_log
            // 
            this.listBox_log.FormattingEnabled = true;
            this.listBox_log.ItemHeight = 12;
            this.listBox_log.Location = new System.Drawing.Point(26, 459);
            this.listBox_log.Name = "listBox_log";
            this.listBox_log.Size = new System.Drawing.Size(738, 112);
            this.listBox_log.TabIndex = 2;
            // 
            // label_timeNow
            // 
            this.label_timeNow.AutoSize = true;
            this.label_timeNow.Location = new System.Drawing.Point(26, 590);
            this.label_timeNow.Name = "label_timeNow";
            this.label_timeNow.Size = new System.Drawing.Size(38, 12);
            this.label_timeNow.TabIndex = 3;
            this.label_timeNow.Text = "label1";
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 622);
            this.Controls.Add(this.label_timeNow);
            this.Controls.Add(this.listBox_log);
            this.Controls.Add(this.groupBox4);
            this.Controls.Add(this.groupBox3);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Name = "Main";
            this.Text = "Form1";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox4.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_parkingManagement)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button button_parking;
        private System.Windows.Forms.TextBox textBox_phoneNum;
        private System.Windows.Forms.TextBox textBox_driverName;
        private System.Windows.Forms.TextBox textBox_carNum;
        private System.Windows.Forms.TextBox textBox_parkingSpot;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.ListBox listBox_log;
        private System.Windows.Forms.Label label_timeNow;
        private System.Windows.Forms.Button button_remove;
        private System.Windows.Forms.Button button_refresh;
        private System.Windows.Forms.Button button_delete;
        private System.Windows.Forms.Button button_add;
        private System.Windows.Forms.Button button_find;
        private System.Windows.Forms.TextBox textBox_findNum;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textBox_costSpot;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.DataGridView dataGridView_parkingManagement;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.TextBox textBox_findCost;
        private System.Windows.Forms.Button button_findCost;
    }
}

