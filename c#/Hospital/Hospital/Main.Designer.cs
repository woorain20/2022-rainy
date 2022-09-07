namespace Hospital
{
    partial class Main
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.환자정보ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.약품정보ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.대기자ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.관리자정보ToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.dataGridView_Patient = new System.Windows.Forms.DataGridView();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.dataGridView_Treat = new System.Windows.Forms.DataGridView();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.textBox_PMedic = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.textBox_PDia = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.textBox_PVisit = new System.Windows.Forms.TextBox();
            this.label8 = new System.Windows.Forms.Label();
            this.textBox_PAdress = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.textBox_PPnum = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.textBox_PGen = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.textBox_PBirth = new System.Windows.Forms.TextBox();
            this.textBox_PAge = new System.Windows.Forms.TextBox();
            this.textBox_PName = new System.Windows.Forms.TextBox();
            this.textBox_ChartNum = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.groupBox5 = new System.Windows.Forms.GroupBox();
            this.dataGridView_Medicine = new System.Windows.Forms.DataGridView();
            this.label_Now = new System.Windows.Forms.Label();
            this.timer_Now = new System.Windows.Forms.Timer(this.components);
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.button_Reset = new System.Windows.Forms.Button();
            this.button_Update = new System.Windows.Forms.Button();
            this.textBox_Hospital = new System.Windows.Forms.TextBox();
            this.label16 = new System.Windows.Forms.Label();
            this.textBox_Doctor = new System.Windows.Forms.TextBox();
            this.label15 = new System.Windows.Forms.Label();
            this.textBox_Medic = new System.Windows.Forms.TextBox();
            this.label14 = new System.Windows.Forms.Label();
            this.dateTimePicker_Med = new System.Windows.Forms.DateTimePicker();
            this.dateTimePicker_Visit = new System.Windows.Forms.DateTimePicker();
            this.label13 = new System.Windows.Forms.Label();
            this.label12 = new System.Windows.Forms.Label();
            this.textBox_Pros = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.label_Manage = new System.Windows.Forms.Label();
            this.pCodeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ageDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.genderDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.addressDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.phoneNumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.visitDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.patientBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.menuStrip1.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Patient)).BeginInit();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Treat)).BeginInit();
            this.groupBox3.SuspendLayout();
            this.groupBox5.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Medicine)).BeginInit();
            this.groupBox4.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.patientBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.환자정보ToolStripMenuItem,
            this.약품정보ToolStripMenuItem,
            this.대기자ToolStripMenuItem,
            this.관리자정보ToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(977, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // 환자정보ToolStripMenuItem
            // 
            this.환자정보ToolStripMenuItem.Name = "환자정보ToolStripMenuItem";
            this.환자정보ToolStripMenuItem.Size = new System.Drawing.Size(71, 20);
            this.환자정보ToolStripMenuItem.Text = "환자 정보";
            this.환자정보ToolStripMenuItem.Click += new System.EventHandler(this.환자정보ToolStripMenuItem_Click);
            // 
            // 약품정보ToolStripMenuItem
            // 
            this.약품정보ToolStripMenuItem.Name = "약품정보ToolStripMenuItem";
            this.약품정보ToolStripMenuItem.Size = new System.Drawing.Size(83, 20);
            this.약품정보ToolStripMenuItem.Text = "의약품 정보";
            this.약품정보ToolStripMenuItem.Click += new System.EventHandler(this.약품정보ToolStripMenuItem_Click);
            // 
            // 대기자ToolStripMenuItem
            // 
            this.대기자ToolStripMenuItem.Name = "대기자ToolStripMenuItem";
            this.대기자ToolStripMenuItem.Size = new System.Drawing.Size(83, 20);
            this.대기자ToolStripMenuItem.Text = "대기자 명단";
            this.대기자ToolStripMenuItem.Click += new System.EventHandler(this.대기자ToolStripMenuItem_Click);
            // 
            // 관리자정보ToolStripMenuItem
            // 
            this.관리자정보ToolStripMenuItem.Name = "관리자정보ToolStripMenuItem";
            this.관리자정보ToolStripMenuItem.Size = new System.Drawing.Size(83, 20);
            this.관리자정보ToolStripMenuItem.Text = "관리자 정보";
            this.관리자정보ToolStripMenuItem.Click += new System.EventHandler(this.관리자정보ToolStripMenuItem_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.dataGridView_Patient);
            this.groupBox1.Location = new System.Drawing.Point(13, 28);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(199, 305);
            this.groupBox1.TabIndex = 1;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "환자 정보";
            // 
            // dataGridView_Patient
            // 
            this.dataGridView_Patient.AutoGenerateColumns = false;
            this.dataGridView_Patient.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_Patient.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.pCodeDataGridViewTextBoxColumn,
            this.nameDataGridViewTextBoxColumn,
            this.ageDataGridViewTextBoxColumn,
            this.genderDataGridViewTextBoxColumn,
            this.addressDataGridViewTextBoxColumn,
            this.phoneNumDataGridViewTextBoxColumn,
            this.visitDataGridViewTextBoxColumn});
            this.dataGridView_Patient.DataSource = this.patientBindingSource;
            this.dataGridView_Patient.Location = new System.Drawing.Point(0, 20);
            this.dataGridView_Patient.Name = "dataGridView_Patient";
            this.dataGridView_Patient.RowTemplate.Height = 23;
            this.dataGridView_Patient.Size = new System.Drawing.Size(199, 285);
            this.dataGridView_Patient.TabIndex = 0;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.dataGridView_Treat);
            this.groupBox2.Location = new System.Drawing.Point(14, 339);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(199, 239);
            this.groupBox2.TabIndex = 2;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "진료 내역";
            // 
            // dataGridView_Treat
            // 
            this.dataGridView_Treat.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_Treat.Location = new System.Drawing.Point(0, 20);
            this.dataGridView_Treat.Name = "dataGridView_Treat";
            this.dataGridView_Treat.RowTemplate.Height = 23;
            this.dataGridView_Treat.Size = new System.Drawing.Size(199, 219);
            this.dataGridView_Treat.TabIndex = 0;
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.textBox_PMedic);
            this.groupBox3.Controls.Add(this.label10);
            this.groupBox3.Controls.Add(this.textBox_PDia);
            this.groupBox3.Controls.Add(this.label9);
            this.groupBox3.Controls.Add(this.textBox_PVisit);
            this.groupBox3.Controls.Add(this.label8);
            this.groupBox3.Controls.Add(this.textBox_PAdress);
            this.groupBox3.Controls.Add(this.label7);
            this.groupBox3.Controls.Add(this.textBox_PPnum);
            this.groupBox3.Controls.Add(this.label6);
            this.groupBox3.Controls.Add(this.textBox_PGen);
            this.groupBox3.Controls.Add(this.label5);
            this.groupBox3.Controls.Add(this.textBox_PBirth);
            this.groupBox3.Controls.Add(this.textBox_PAge);
            this.groupBox3.Controls.Add(this.textBox_PName);
            this.groupBox3.Controls.Add(this.textBox_ChartNum);
            this.groupBox3.Controls.Add(this.label4);
            this.groupBox3.Controls.Add(this.label3);
            this.groupBox3.Controls.Add(this.label2);
            this.groupBox3.Controls.Add(this.label1);
            this.groupBox3.Location = new System.Drawing.Point(218, 28);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(545, 239);
            this.groupBox3.TabIndex = 3;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "진료 차트";
            // 
            // textBox_PMedic
            // 
            this.textBox_PMedic.Location = new System.Drawing.Point(95, 176);
            this.textBox_PMedic.Name = "textBox_PMedic";
            this.textBox_PMedic.Size = new System.Drawing.Size(217, 21);
            this.textBox_PMedic.TabIndex = 19;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(16, 179);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(53, 12);
            this.label10.TabIndex = 18;
            this.label10.Text = "최근처방";
            // 
            // textBox_PDia
            // 
            this.textBox_PDia.Location = new System.Drawing.Point(297, 138);
            this.textBox_PDia.Name = "textBox_PDia";
            this.textBox_PDia.Size = new System.Drawing.Size(224, 21);
            this.textBox_PDia.TabIndex = 17;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(238, 141);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(53, 12);
            this.label9.TabIndex = 16;
            this.label9.Text = "최근진단";
            // 
            // textBox_PVisit
            // 
            this.textBox_PVisit.Location = new System.Drawing.Point(95, 138);
            this.textBox_PVisit.Name = "textBox_PVisit";
            this.textBox_PVisit.Size = new System.Drawing.Size(127, 21);
            this.textBox_PVisit.TabIndex = 15;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(16, 141);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(53, 12);
            this.label8.TabIndex = 14;
            this.label8.Text = "최근방문";
            // 
            // textBox_PAdress
            // 
            this.textBox_PAdress.Location = new System.Drawing.Point(95, 97);
            this.textBox_PAdress.Name = "textBox_PAdress";
            this.textBox_PAdress.Size = new System.Drawing.Size(426, 21);
            this.textBox_PAdress.TabIndex = 13;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(16, 100);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(29, 12);
            this.label7.TabIndex = 12;
            this.label7.Text = "주소";
            // 
            // textBox_PPnum
            // 
            this.textBox_PPnum.Location = new System.Drawing.Point(433, 59);
            this.textBox_PPnum.Name = "textBox_PPnum";
            this.textBox_PPnum.Size = new System.Drawing.Size(88, 21);
            this.textBox_PPnum.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(378, 62);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(41, 12);
            this.label6.TabIndex = 10;
            this.label6.Text = "연락처";
            // 
            // textBox_PGen
            // 
            this.textBox_PGen.Location = new System.Drawing.Point(264, 59);
            this.textBox_PGen.Name = "textBox_PGen";
            this.textBox_PGen.Size = new System.Drawing.Size(88, 21);
            this.textBox_PGen.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(209, 62);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(29, 12);
            this.label5.TabIndex = 8;
            this.label5.Text = "성별";
            // 
            // textBox_PBirth
            // 
            this.textBox_PBirth.Location = new System.Drawing.Point(95, 59);
            this.textBox_PBirth.Name = "textBox_PBirth";
            this.textBox_PBirth.Size = new System.Drawing.Size(88, 21);
            this.textBox_PBirth.TabIndex = 7;
            // 
            // textBox_PAge
            // 
            this.textBox_PAge.Location = new System.Drawing.Point(433, 17);
            this.textBox_PAge.Name = "textBox_PAge";
            this.textBox_PAge.Size = new System.Drawing.Size(88, 21);
            this.textBox_PAge.TabIndex = 6;
            // 
            // textBox_PName
            // 
            this.textBox_PName.Location = new System.Drawing.Point(264, 17);
            this.textBox_PName.Name = "textBox_PName";
            this.textBox_PName.Size = new System.Drawing.Size(88, 21);
            this.textBox_PName.TabIndex = 5;
            // 
            // textBox_ChartNum
            // 
            this.textBox_ChartNum.Location = new System.Drawing.Point(95, 17);
            this.textBox_ChartNum.Name = "textBox_ChartNum";
            this.textBox_ChartNum.Size = new System.Drawing.Size(88, 21);
            this.textBox_ChartNum.TabIndex = 4;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(16, 62);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(53, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "생년월일";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(378, 20);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(29, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "나이";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(209, 20);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(29, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "이름";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(16, 20);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "차트번호";
            // 
            // groupBox5
            // 
            this.groupBox5.Controls.Add(this.dataGridView_Medicine);
            this.groupBox5.Location = new System.Drawing.Point(768, 28);
            this.groupBox5.Name = "groupBox5";
            this.groupBox5.Size = new System.Drawing.Size(199, 550);
            this.groupBox5.TabIndex = 3;
            this.groupBox5.TabStop = false;
            this.groupBox5.Text = "처방 의약품";
            // 
            // dataGridView_Medicine
            // 
            this.dataGridView_Medicine.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_Medicine.Location = new System.Drawing.Point(0, 20);
            this.dataGridView_Medicine.Name = "dataGridView_Medicine";
            this.dataGridView_Medicine.RowTemplate.Height = 23;
            this.dataGridView_Medicine.Size = new System.Drawing.Size(199, 530);
            this.dataGridView_Medicine.TabIndex = 0;
            // 
            // label_Now
            // 
            this.label_Now.AutoSize = true;
            this.label_Now.Location = new System.Drawing.Point(11, 595);
            this.label_Now.Name = "label_Now";
            this.label_Now.Size = new System.Drawing.Size(38, 12);
            this.label_Now.TabIndex = 4;
            this.label_Now.Text = "label1";
            // 
            // timer_Now
            // 
            this.timer_Now.Enabled = true;
            this.timer_Now.Interval = 1000;
            this.timer_Now.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.button_Reset);
            this.groupBox4.Controls.Add(this.button_Update);
            this.groupBox4.Controls.Add(this.textBox_Hospital);
            this.groupBox4.Controls.Add(this.label16);
            this.groupBox4.Controls.Add(this.textBox_Doctor);
            this.groupBox4.Controls.Add(this.label15);
            this.groupBox4.Controls.Add(this.textBox_Medic);
            this.groupBox4.Controls.Add(this.label14);
            this.groupBox4.Controls.Add(this.dateTimePicker_Med);
            this.groupBox4.Controls.Add(this.dateTimePicker_Visit);
            this.groupBox4.Controls.Add(this.label13);
            this.groupBox4.Controls.Add(this.label12);
            this.groupBox4.Controls.Add(this.textBox_Pros);
            this.groupBox4.Controls.Add(this.label11);
            this.groupBox4.Location = new System.Drawing.Point(220, 273);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(543, 305);
            this.groupBox4.TabIndex = 6;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "진료";
            // 
            // button_Reset
            // 
            this.button_Reset.Location = new System.Drawing.Point(462, 191);
            this.button_Reset.Name = "button_Reset";
            this.button_Reset.Size = new System.Drawing.Size(75, 23);
            this.button_Reset.TabIndex = 33;
            this.button_Reset.Text = "초기화";
            this.button_Reset.UseVisualStyleBackColor = true;
            // 
            // button_Update
            // 
            this.button_Update.Location = new System.Drawing.Point(17, 191);
            this.button_Update.Name = "button_Update";
            this.button_Update.Size = new System.Drawing.Size(75, 23);
            this.button_Update.TabIndex = 32;
            this.button_Update.Text = "진단";
            this.button_Update.UseVisualStyleBackColor = true;
            // 
            // textBox_Hospital
            // 
            this.textBox_Hospital.Location = new System.Drawing.Point(372, 148);
            this.textBox_Hospital.Name = "textBox_Hospital";
            this.textBox_Hospital.Size = new System.Drawing.Size(165, 21);
            this.textBox_Hospital.TabIndex = 31;
            // 
            // label16
            // 
            this.label16.AutoSize = true;
            this.label16.Location = new System.Drawing.Point(298, 151);
            this.label16.Name = "label16";
            this.label16.Size = new System.Drawing.Size(29, 12);
            this.label16.TabIndex = 30;
            this.label16.Text = "병원";
            // 
            // textBox_Doctor
            // 
            this.textBox_Doctor.Location = new System.Drawing.Point(84, 148);
            this.textBox_Doctor.Name = "textBox_Doctor";
            this.textBox_Doctor.Size = new System.Drawing.Size(189, 21);
            this.textBox_Doctor.TabIndex = 29;
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(15, 151);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(29, 12);
            this.label15.TabIndex = 28;
            this.label15.Text = "의사";
            // 
            // textBox_Medic
            // 
            this.textBox_Medic.Location = new System.Drawing.Point(372, 110);
            this.textBox_Medic.Name = "textBox_Medic";
            this.textBox_Medic.Size = new System.Drawing.Size(165, 21);
            this.textBox_Medic.TabIndex = 27;
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(298, 116);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(53, 12);
            this.label14.TabIndex = 26;
            this.label14.Text = "처방기간";
            // 
            // dateTimePicker_Med
            // 
            this.dateTimePicker_Med.Location = new System.Drawing.Point(84, 110);
            this.dateTimePicker_Med.Name = "dateTimePicker_Med";
            this.dateTimePicker_Med.Size = new System.Drawing.Size(189, 21);
            this.dateTimePicker_Med.TabIndex = 25;
            // 
            // dateTimePicker_Visit
            // 
            this.dateTimePicker_Visit.Location = new System.Drawing.Point(63, 27);
            this.dateTimePicker_Visit.Name = "dateTimePicker_Visit";
            this.dateTimePicker_Visit.Size = new System.Drawing.Size(200, 21);
            this.dateTimePicker_Visit.TabIndex = 24;
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(15, 33);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(41, 12);
            this.label13.TabIndex = 23;
            this.label13.Text = "방문일";
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(15, 116);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(53, 12);
            this.label12.TabIndex = 21;
            this.label12.Text = "처방시작";
            // 
            // textBox_Pros
            // 
            this.textBox_Pros.Location = new System.Drawing.Point(63, 71);
            this.textBox_Pros.Name = "textBox_Pros";
            this.textBox_Pros.Size = new System.Drawing.Size(474, 21);
            this.textBox_Pros.TabIndex = 20;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(15, 77);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(29, 12);
            this.label11.TabIndex = 19;
            this.label11.Text = "진단";
            // 
            // label_Manage
            // 
            this.label_Manage.AutoSize = true;
            this.label_Manage.Location = new System.Drawing.Point(915, 594);
            this.label_Manage.Name = "label_Manage";
            this.label_Manage.Size = new System.Drawing.Size(44, 12);
            this.label_Manage.TabIndex = 7;
            this.label_Manage.Text = "label17";
            // 
            // pCodeDataGridViewTextBoxColumn
            // 
            this.pCodeDataGridViewTextBoxColumn.DataPropertyName = "pCode";
            this.pCodeDataGridViewTextBoxColumn.HeaderText = "환자번호";
            this.pCodeDataGridViewTextBoxColumn.Name = "pCodeDataGridViewTextBoxColumn";
            this.pCodeDataGridViewTextBoxColumn.Visible = false;
            // 
            // nameDataGridViewTextBoxColumn
            // 
            this.nameDataGridViewTextBoxColumn.DataPropertyName = "name";
            this.nameDataGridViewTextBoxColumn.HeaderText = "이름";
            this.nameDataGridViewTextBoxColumn.Name = "nameDataGridViewTextBoxColumn";
            // 
            // ageDataGridViewTextBoxColumn
            // 
            this.ageDataGridViewTextBoxColumn.DataPropertyName = "age";
            this.ageDataGridViewTextBoxColumn.HeaderText = "나이";
            this.ageDataGridViewTextBoxColumn.Name = "ageDataGridViewTextBoxColumn";
            // 
            // genderDataGridViewTextBoxColumn
            // 
            this.genderDataGridViewTextBoxColumn.DataPropertyName = "gender";
            this.genderDataGridViewTextBoxColumn.HeaderText = "성별";
            this.genderDataGridViewTextBoxColumn.Name = "genderDataGridViewTextBoxColumn";
            // 
            // addressDataGridViewTextBoxColumn
            // 
            this.addressDataGridViewTextBoxColumn.DataPropertyName = "address";
            this.addressDataGridViewTextBoxColumn.HeaderText = "주소";
            this.addressDataGridViewTextBoxColumn.Name = "addressDataGridViewTextBoxColumn";
            this.addressDataGridViewTextBoxColumn.Visible = false;
            // 
            // phoneNumDataGridViewTextBoxColumn
            // 
            this.phoneNumDataGridViewTextBoxColumn.DataPropertyName = "phoneNum";
            this.phoneNumDataGridViewTextBoxColumn.HeaderText = "연락처";
            this.phoneNumDataGridViewTextBoxColumn.Name = "phoneNumDataGridViewTextBoxColumn";
            this.phoneNumDataGridViewTextBoxColumn.Visible = false;
            // 
            // visitDataGridViewTextBoxColumn
            // 
            this.visitDataGridViewTextBoxColumn.DataPropertyName = "visit";
            this.visitDataGridViewTextBoxColumn.HeaderText = "최근방문";
            this.visitDataGridViewTextBoxColumn.Name = "visitDataGridViewTextBoxColumn";
            // 
            // patientBindingSource
            // 
            this.patientBindingSource.DataSource = typeof(Hospital.Patient);
            // 
            // Main
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(977, 616);
            this.Controls.Add(this.label_Manage);
            this.Controls.Add(this.groupBox4);
            this.Controls.Add(this.label_Now);
            this.Controls.Add(this.groupBox5);
            this.Controls.Add(this.groupBox3);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Main";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Main";
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Patient)).EndInit();
            this.groupBox2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Treat)).EndInit();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox5.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_Medicine)).EndInit();
            this.groupBox4.ResumeLayout(false);
            this.groupBox4.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.patientBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem 환자정보ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 약품정보ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 대기자ToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem 관리자정보ToolStripMenuItem;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.GroupBox groupBox5;
        private System.Windows.Forms.Label label_Now;
        private System.Windows.Forms.Timer timer_Now;
        private System.Windows.Forms.DataGridView dataGridView_Patient;
        private System.Windows.Forms.DataGridView dataGridView_Treat;
        private System.Windows.Forms.DataGridView dataGridView_Medicine;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox textBox_ChartNum;
        private System.Windows.Forms.TextBox textBox_PName;
        private System.Windows.Forms.TextBox textBox_PAge;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox textBox_PGen;
        private System.Windows.Forms.TextBox textBox_PPnum;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBox_PAdress;
        private System.Windows.Forms.TextBox textBox_PVisit;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox textBox_PBirth;
        private System.Windows.Forms.TextBox textBox_PDia;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox textBox_PMedic;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.TextBox textBox_Pros;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.DateTimePicker dateTimePicker_Visit;
        private System.Windows.Forms.DateTimePicker dateTimePicker_Med;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.TextBox textBox_Medic;
        private System.Windows.Forms.Label label16;
        private System.Windows.Forms.TextBox textBox_Doctor;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.TextBox textBox_Hospital;
        private System.Windows.Forms.Button button_Update;
        private System.Windows.Forms.Button button_Reset;
        private System.Windows.Forms.Label label_Manage;
        private System.Windows.Forms.DataGridViewTextBoxColumn pCodeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn ageDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn genderDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn addressDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn phoneNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn visitDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource patientBindingSource;
    }
}