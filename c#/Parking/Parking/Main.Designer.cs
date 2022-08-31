namespace Parking
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
            this.button_Remove = new System.Windows.Forms.Button();
            this.button_Parking = new System.Windows.Forms.Button();
            this.textBox_PhoneNum = new System.Windows.Forms.TextBox();
            this.textBox_DriverName = new System.Windows.Forms.TextBox();
            this.textBox_CarNum = new System.Windows.Forms.TextBox();
            this.textBox_ParkingSpot = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.button_Refresh = new System.Windows.Forms.Button();
            this.button_Delete = new System.Windows.Forms.Button();
            this.button_Add = new System.Windows.Forms.Button();
            this.button_Check = new System.Windows.Forms.Button();
            this.textBox_FindSpot = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.textBox_Cost = new System.Windows.Forms.TextBox();
            this.button_Cost = new System.Windows.Forms.Button();
            this.textBox_CostSpot = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.listBox_log = new System.Windows.Forms.ListBox();
            this.label_Now = new System.Windows.Forms.Label();
            this.timer_Now = new System.Windows.Forms.Timer(this.components);
            this.dataGridView_ParkingManager = new System.Windows.Forms.DataGridView();
            this.parkingSpotDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.carNumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.driverNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.phoneNumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.parkingTimeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.parkingCarBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_ParkingManager)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.parkingCarBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.button_Remove);
            this.groupBox1.Controls.Add(this.button_Parking);
            this.groupBox1.Controls.Add(this.textBox_PhoneNum);
            this.groupBox1.Controls.Add(this.textBox_DriverName);
            this.groupBox1.Controls.Add(this.textBox_CarNum);
            this.groupBox1.Controls.Add(this.textBox_ParkingSpot);
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Location = new System.Drawing.Point(12, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(300, 166);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "주차/출차";
            // 
            // button_Remove
            // 
            this.button_Remove.Location = new System.Drawing.Point(219, 110);
            this.button_Remove.Name = "button_Remove";
            this.button_Remove.Size = new System.Drawing.Size(75, 23);
            this.button_Remove.TabIndex = 9;
            this.button_Remove.Text = "출차";
            this.button_Remove.UseVisualStyleBackColor = true;
            this.button_Remove.Click += new System.EventHandler(this.button_Remove_Click);
            // 
            // button_Parking
            // 
            this.button_Parking.Location = new System.Drawing.Point(219, 43);
            this.button_Parking.Name = "button_Parking";
            this.button_Parking.Size = new System.Drawing.Size(75, 23);
            this.button_Parking.TabIndex = 8;
            this.button_Parking.Text = "주차";
            this.button_Parking.UseVisualStyleBackColor = true;
            this.button_Parking.Click += new System.EventHandler(this.button_Parking_Click);
            // 
            // textBox_PhoneNum
            // 
            this.textBox_PhoneNum.Location = new System.Drawing.Point(82, 130);
            this.textBox_PhoneNum.Name = "textBox_PhoneNum";
            this.textBox_PhoneNum.Size = new System.Drawing.Size(108, 21);
            this.textBox_PhoneNum.TabIndex = 7;
            // 
            // textBox_DriverName
            // 
            this.textBox_DriverName.Location = new System.Drawing.Point(82, 95);
            this.textBox_DriverName.Name = "textBox_DriverName";
            this.textBox_DriverName.Size = new System.Drawing.Size(108, 21);
            this.textBox_DriverName.TabIndex = 6;
            // 
            // textBox_CarNum
            // 
            this.textBox_CarNum.Location = new System.Drawing.Point(82, 60);
            this.textBox_CarNum.Name = "textBox_CarNum";
            this.textBox_CarNum.Size = new System.Drawing.Size(108, 21);
            this.textBox_CarNum.TabIndex = 5;
            // 
            // textBox_ParkingSpot
            // 
            this.textBox_ParkingSpot.Location = new System.Drawing.Point(82, 25);
            this.textBox_ParkingSpot.Name = "textBox_ParkingSpot";
            this.textBox_ParkingSpot.Size = new System.Drawing.Size(108, 21);
            this.textBox_ParkingSpot.TabIndex = 4;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(6, 136);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 12);
            this.label5.TabIndex = 3;
            this.label5.Text = "전화번호";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(6, 100);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 2;
            this.label4.Text = "운전자명";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 64);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 1;
            this.label3.Text = "차량번호";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(6, 28);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 0;
            this.label2.Text = "주차공간";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.button_Refresh);
            this.groupBox2.Controls.Add(this.button_Delete);
            this.groupBox2.Controls.Add(this.button_Add);
            this.groupBox2.Controls.Add(this.button_Check);
            this.groupBox2.Controls.Add(this.textBox_FindSpot);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Location = new System.Drawing.Point(318, 12);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(250, 166);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "주차공간 관리";
            // 
            // button_Refresh
            // 
            this.button_Refresh.Location = new System.Drawing.Point(149, 130);
            this.button_Refresh.Name = "button_Refresh";
            this.button_Refresh.Size = new System.Drawing.Size(75, 23);
            this.button_Refresh.TabIndex = 14;
            this.button_Refresh.Text = "전체 갱신";
            this.button_Refresh.UseVisualStyleBackColor = true;
            this.button_Refresh.Click += new System.EventHandler(this.button_Refresh_Click);
            // 
            // button_Delete
            // 
            this.button_Delete.Location = new System.Drawing.Point(149, 95);
            this.button_Delete.Name = "button_Delete";
            this.button_Delete.Size = new System.Drawing.Size(75, 23);
            this.button_Delete.TabIndex = 13;
            this.button_Delete.Text = "공간 삭제";
            this.button_Delete.UseVisualStyleBackColor = true;
            this.button_Delete.Click += new System.EventHandler(this.button_Delete_Click);
            // 
            // button_Add
            // 
            this.button_Add.Location = new System.Drawing.Point(149, 60);
            this.button_Add.Name = "button_Add";
            this.button_Add.Size = new System.Drawing.Size(75, 23);
            this.button_Add.TabIndex = 12;
            this.button_Add.Text = "공간 추가";
            this.button_Add.UseVisualStyleBackColor = true;
            this.button_Add.Click += new System.EventHandler(this.button_Add_Click);
            // 
            // button_Check
            // 
            this.button_Check.Location = new System.Drawing.Point(149, 25);
            this.button_Check.Name = "button_Check";
            this.button_Check.Size = new System.Drawing.Size(75, 23);
            this.button_Check.TabIndex = 11;
            this.button_Check.Text = "공간 조회";
            this.button_Check.UseVisualStyleBackColor = true;
            this.button_Check.Click += new System.EventHandler(this.button_Check_Click);
            // 
            // textBox_FindSpot
            // 
            this.textBox_FindSpot.Location = new System.Drawing.Point(21, 81);
            this.textBox_FindSpot.Name = "textBox_FindSpot";
            this.textBox_FindSpot.Size = new System.Drawing.Size(108, 21);
            this.textBox_FindSpot.TabIndex = 10;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(45, 48);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(53, 12);
            this.label6.TabIndex = 1;
            this.label6.Text = "주차공간";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.textBox_Cost);
            this.groupBox3.Controls.Add(this.button_Cost);
            this.groupBox3.Controls.Add(this.textBox_CostSpot);
            this.groupBox3.Controls.Add(this.label7);
            this.groupBox3.Location = new System.Drawing.Point(574, 12);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(238, 166);
            this.groupBox3.TabIndex = 2;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "요금 조회";
            // 
            // textBox_Cost
            // 
            this.textBox_Cost.Location = new System.Drawing.Point(54, 112);
            this.textBox_Cost.Name = "textBox_Cost";
            this.textBox_Cost.Size = new System.Drawing.Size(108, 21);
            this.textBox_Cost.TabIndex = 16;
            // 
            // button_Cost
            // 
            this.button_Cost.Location = new System.Drawing.Point(69, 79);
            this.button_Cost.Name = "button_Cost";
            this.button_Cost.Size = new System.Drawing.Size(75, 23);
            this.button_Cost.TabIndex = 15;
            this.button_Cost.Text = "요금 조회";
            this.button_Cost.UseVisualStyleBackColor = true;
            this.button_Cost.Click += new System.EventHandler(this.button_Cost_Click);
            // 
            // textBox_CostSpot
            // 
            this.textBox_CostSpot.Location = new System.Drawing.Point(111, 43);
            this.textBox_CostSpot.Name = "textBox_CostSpot";
            this.textBox_CostSpot.Size = new System.Drawing.Size(108, 21);
            this.textBox_CostSpot.TabIndex = 15;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(23, 48);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(53, 12);
            this.label7.TabIndex = 2;
            this.label7.Text = "주차공간";
            // 
            // groupBox4
            // 
            this.groupBox4.Location = new System.Drawing.Point(12, 194);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(800, 215);
            this.groupBox4.TabIndex = 1;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "주차 현황";
            // 
            // listBox_log
            // 
            this.listBox_log.FormattingEnabled = true;
            this.listBox_log.ItemHeight = 12;
            this.listBox_log.Location = new System.Drawing.Point(13, 416);
            this.listBox_log.Name = "listBox_log";
            this.listBox_log.Size = new System.Drawing.Size(799, 136);
            this.listBox_log.TabIndex = 3;
            // 
            // label_Now
            // 
            this.label_Now.AutoSize = true;
            this.label_Now.Location = new System.Drawing.Point(12, 568);
            this.label_Now.Name = "label_Now";
            this.label_Now.Size = new System.Drawing.Size(38, 12);
            this.label_Now.TabIndex = 4;
            this.label_Now.Text = "label1";
            this.label_Now.Click += new System.EventHandler(this.label_Now_Click);
            // 
            // timer_Now
            // 
            this.timer_Now.Tick += new System.EventHandler(this.timer_Now_Tick);
            // 
            // dataGridView_ParkingManager
            // 
            this.dataGridView_ParkingManager.AutoGenerateColumns = false;
            this.dataGridView_ParkingManager.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_ParkingManager.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.parkingSpotDataGridViewTextBoxColumn,
            this.carNumDataGridViewTextBoxColumn,
            this.driverNameDataGridViewTextBoxColumn,
            this.phoneNumDataGridViewTextBoxColumn,
            this.parkingTimeDataGridViewTextBoxColumn});
            this.dataGridView_ParkingManager.DataSource = this.parkingCarBindingSource;
            this.dataGridView_ParkingManager.Location = new System.Drawing.Point(12, 214);
            this.dataGridView_ParkingManager.Name = "dataGridView_ParkingManager";
            this.dataGridView_ParkingManager.RowTemplate.Height = 23;
            this.dataGridView_ParkingManager.Size = new System.Drawing.Size(800, 195);
            this.dataGridView_ParkingManager.TabIndex = 0;
            this.dataGridView_ParkingManager.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView_ParkingManager_CellClick);
            this.dataGridView_ParkingManager.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView_ParkingManager_CellContentClick);
            // 
            // parkingSpotDataGridViewTextBoxColumn
            // 
            this.parkingSpotDataGridViewTextBoxColumn.DataPropertyName = "ParkingSpot";
            this.parkingSpotDataGridViewTextBoxColumn.HeaderText = "주차공간";
            this.parkingSpotDataGridViewTextBoxColumn.Name = "parkingSpotDataGridViewTextBoxColumn";
            // 
            // carNumDataGridViewTextBoxColumn
            // 
            this.carNumDataGridViewTextBoxColumn.DataPropertyName = "CarNum";
            this.carNumDataGridViewTextBoxColumn.HeaderText = "차량번호";
            this.carNumDataGridViewTextBoxColumn.Name = "carNumDataGridViewTextBoxColumn";
            // 
            // driverNameDataGridViewTextBoxColumn
            // 
            this.driverNameDataGridViewTextBoxColumn.DataPropertyName = "DriverName";
            this.driverNameDataGridViewTextBoxColumn.HeaderText = "운전자명";
            this.driverNameDataGridViewTextBoxColumn.Name = "driverNameDataGridViewTextBoxColumn";
            // 
            // phoneNumDataGridViewTextBoxColumn
            // 
            this.phoneNumDataGridViewTextBoxColumn.DataPropertyName = "PhoneNum";
            this.phoneNumDataGridViewTextBoxColumn.HeaderText = "전화번호";
            this.phoneNumDataGridViewTextBoxColumn.Name = "phoneNumDataGridViewTextBoxColumn";
            // 
            // parkingTimeDataGridViewTextBoxColumn
            // 
            this.parkingTimeDataGridViewTextBoxColumn.DataPropertyName = "ParkingTime";
            this.parkingTimeDataGridViewTextBoxColumn.HeaderText = "주차시간";
            this.parkingTimeDataGridViewTextBoxColumn.Name = "parkingTimeDataGridViewTextBoxColumn";
            // 
            // parkingCarBindingSource
            // 
            this.parkingCarBindingSource.DataSource = typeof(Parking.ParkingCar);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(824, 598);
            this.Controls.Add(this.dataGridView_ParkingManager);
            this.Controls.Add(this.label_Now);
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
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_ParkingManager)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.parkingCarBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.ListBox listBox_log;
        private System.Windows.Forms.Label label_Now;
        private System.Windows.Forms.Timer timer_Now;
        private System.Windows.Forms.Button button_Remove;
        private System.Windows.Forms.Button button_Parking;
        private System.Windows.Forms.TextBox textBox_PhoneNum;
        private System.Windows.Forms.TextBox textBox_DriverName;
        private System.Windows.Forms.TextBox textBox_CarNum;
        private System.Windows.Forms.TextBox textBox_ParkingSpot;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button button_Refresh;
        private System.Windows.Forms.Button button_Delete;
        private System.Windows.Forms.Button button_Add;
        private System.Windows.Forms.Button button_Check;
        private System.Windows.Forms.TextBox textBox_FindSpot;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.TextBox textBox_CostSpot;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBox_Cost;
        private System.Windows.Forms.Button button_Cost;
        private System.Windows.Forms.DataGridView dataGridView_ParkingManager;
        private System.Windows.Forms.BindingSource parkingCarBindingSource;
        private System.Windows.Forms.DataGridViewTextBoxColumn parkingSpotDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn carNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn driverNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn phoneNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn parkingTimeDataGridViewTextBoxColumn;
    }
}

