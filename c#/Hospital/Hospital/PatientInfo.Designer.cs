namespace Hospital
{
    partial class PatientInfo
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
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.dataGridView_PatientList = new System.Windows.Forms.DataGridView();
            this.patientBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.textBox_Birth = new System.Windows.Forms.TextBox();
            this.label10 = new System.Windows.Forms.Label();
            this.button_Reset = new System.Windows.Forms.Button();
            this.textBox_PCode = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.button_modify = new System.Windows.Forms.Button();
            this.textBox_Visit = new System.Windows.Forms.TextBox();
            this.textBox_Address = new System.Windows.Forms.TextBox();
            this.textBox_Phone = new System.Windows.Forms.TextBox();
            this.textBox_Gender = new System.Windows.Forms.TextBox();
            this.textBox_Name = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.treatBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.chartNumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pNameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pBirthDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pGenDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pNumDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pAddressDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pVisitDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pDiagnosisDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.pMedicineDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_PatientList)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.patientBindingSource)).BeginInit();
            this.groupBox2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.treatBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.dataGridView_PatientList);
            this.groupBox1.Location = new System.Drawing.Point(12, 43);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(469, 229);
            this.groupBox1.TabIndex = 0;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "환자 목록";
            // 
            // dataGridView_PatientList
            // 
            this.dataGridView_PatientList.AutoGenerateColumns = false;
            this.dataGridView_PatientList.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView_PatientList.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.chartNumDataGridViewTextBoxColumn,
            this.dataGridViewTextBoxColumn1,
            this.pNameDataGridViewTextBoxColumn,
            this.pBirthDataGridViewTextBoxColumn,
            this.pGenDataGridViewTextBoxColumn,
            this.pNumDataGridViewTextBoxColumn,
            this.pAddressDataGridViewTextBoxColumn,
            this.pVisitDataGridViewTextBoxColumn,
            this.pDiagnosisDataGridViewTextBoxColumn,
            this.pMedicineDataGridViewTextBoxColumn});
            this.dataGridView_PatientList.DataSource = this.treatBindingSource;
            this.dataGridView_PatientList.Location = new System.Drawing.Point(0, 20);
            this.dataGridView_PatientList.Name = "dataGridView_PatientList";
            this.dataGridView_PatientList.RowTemplate.Height = 23;
            this.dataGridView_PatientList.Size = new System.Drawing.Size(469, 203);
            this.dataGridView_PatientList.TabIndex = 0;
            this.dataGridView_PatientList.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView_PatientList_CellClick);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("한컴 소망 M", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.label1.Location = new System.Drawing.Point(188, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(112, 31);
            this.label1.TabIndex = 1;
            this.label1.Text = "환자 정보";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(22, 76);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 2;
            this.label2.Text = "생년월일";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(249, 76);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(29, 12);
            this.label4.TabIndex = 4;
            this.label4.Text = "성별";
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.textBox_Birth);
            this.groupBox2.Controls.Add(this.label10);
            this.groupBox2.Controls.Add(this.button_Reset);
            this.groupBox2.Controls.Add(this.textBox_PCode);
            this.groupBox2.Controls.Add(this.label9);
            this.groupBox2.Controls.Add(this.button_modify);
            this.groupBox2.Controls.Add(this.textBox_Visit);
            this.groupBox2.Controls.Add(this.textBox_Address);
            this.groupBox2.Controls.Add(this.textBox_Phone);
            this.groupBox2.Controls.Add(this.textBox_Gender);
            this.groupBox2.Controls.Add(this.textBox_Name);
            this.groupBox2.Controls.Add(this.label7);
            this.groupBox2.Controls.Add(this.label6);
            this.groupBox2.Controls.Add(this.label5);
            this.groupBox2.Controls.Add(this.label2);
            this.groupBox2.Controls.Add(this.label4);
            this.groupBox2.Location = new System.Drawing.Point(12, 278);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(469, 247);
            this.groupBox2.TabIndex = 1;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "환자 정보";
            // 
            // textBox_Birth
            // 
            this.textBox_Birth.Location = new System.Drawing.Point(94, 73);
            this.textBox_Birth.Name = "textBox_Birth";
            this.textBox_Birth.Size = new System.Drawing.Size(128, 21);
            this.textBox_Birth.TabIndex = 24;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(249, 36);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(29, 12);
            this.label10.TabIndex = 23;
            this.label10.Text = "이름";
            // 
            // button_Reset
            // 
            this.button_Reset.Location = new System.Drawing.Point(369, 218);
            this.button_Reset.Name = "button_Reset";
            this.button_Reset.Size = new System.Drawing.Size(75, 23);
            this.button_Reset.TabIndex = 22;
            this.button_Reset.Text = "갱신";
            this.button_Reset.UseVisualStyleBackColor = true;
            this.button_Reset.Click += new System.EventHandler(this.button_Reset_Click);
            // 
            // textBox_PCode
            // 
            this.textBox_PCode.Location = new System.Drawing.Point(94, 33);
            this.textBox_PCode.Name = "textBox_PCode";
            this.textBox_PCode.Size = new System.Drawing.Size(128, 21);
            this.textBox_PCode.TabIndex = 21;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(22, 36);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(53, 12);
            this.label9.TabIndex = 20;
            this.label9.Text = "환자번호";
            // 
            // button_modify
            // 
            this.button_modify.Location = new System.Drawing.Point(24, 218);
            this.button_modify.Name = "button_modify";
            this.button_modify.Size = new System.Drawing.Size(75, 23);
            this.button_modify.TabIndex = 19;
            this.button_modify.Text = "수정";
            this.button_modify.UseVisualStyleBackColor = true;
            this.button_modify.Click += new System.EventHandler(this.button_modify_Click);
            // 
            // textBox_Visit
            // 
            this.textBox_Visit.Location = new System.Drawing.Point(303, 116);
            this.textBox_Visit.Name = "textBox_Visit";
            this.textBox_Visit.Size = new System.Drawing.Size(141, 21);
            this.textBox_Visit.TabIndex = 13;
            // 
            // textBox_Address
            // 
            this.textBox_Address.Location = new System.Drawing.Point(94, 159);
            this.textBox_Address.Name = "textBox_Address";
            this.textBox_Address.Size = new System.Drawing.Size(350, 21);
            this.textBox_Address.TabIndex = 12;
            // 
            // textBox_Phone
            // 
            this.textBox_Phone.Location = new System.Drawing.Point(94, 116);
            this.textBox_Phone.Name = "textBox_Phone";
            this.textBox_Phone.Size = new System.Drawing.Size(128, 21);
            this.textBox_Phone.TabIndex = 11;
            // 
            // textBox_Gender
            // 
            this.textBox_Gender.Location = new System.Drawing.Point(303, 73);
            this.textBox_Gender.Name = "textBox_Gender";
            this.textBox_Gender.Size = new System.Drawing.Size(141, 21);
            this.textBox_Gender.TabIndex = 10;
            // 
            // textBox_Name
            // 
            this.textBox_Name.Location = new System.Drawing.Point(303, 33);
            this.textBox_Name.Name = "textBox_Name";
            this.textBox_Name.Size = new System.Drawing.Size(141, 21);
            this.textBox_Name.TabIndex = 8;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(249, 119);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(29, 12);
            this.label7.TabIndex = 7;
            this.label7.Text = "방문";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(22, 162);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(29, 12);
            this.label6.TabIndex = 6;
            this.label6.Text = "주소";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(22, 119);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(41, 12);
            this.label5.TabIndex = 5;
            this.label5.Text = "연락처";
            // 
            // treatBindingSource
            // 
            this.treatBindingSource.DataSource = typeof(Hospital.Treat);
            // 
            // chartNumDataGridViewTextBoxColumn
            // 
            this.chartNumDataGridViewTextBoxColumn.DataPropertyName = "chartNum";
            this.chartNumDataGridViewTextBoxColumn.HeaderText = "차트번호";
            this.chartNumDataGridViewTextBoxColumn.Name = "chartNumDataGridViewTextBoxColumn";
            this.chartNumDataGridViewTextBoxColumn.Visible = false;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "pCode";
            this.dataGridViewTextBoxColumn1.HeaderText = "환자번호";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            // 
            // pNameDataGridViewTextBoxColumn
            // 
            this.pNameDataGridViewTextBoxColumn.DataPropertyName = "pName";
            this.pNameDataGridViewTextBoxColumn.HeaderText = "이름";
            this.pNameDataGridViewTextBoxColumn.Name = "pNameDataGridViewTextBoxColumn";
            // 
            // pBirthDataGridViewTextBoxColumn
            // 
            this.pBirthDataGridViewTextBoxColumn.DataPropertyName = "pBirth";
            this.pBirthDataGridViewTextBoxColumn.HeaderText = "생년월일";
            this.pBirthDataGridViewTextBoxColumn.Name = "pBirthDataGridViewTextBoxColumn";
            // 
            // pGenDataGridViewTextBoxColumn
            // 
            this.pGenDataGridViewTextBoxColumn.DataPropertyName = "pGen";
            this.pGenDataGridViewTextBoxColumn.HeaderText = "성별";
            this.pGenDataGridViewTextBoxColumn.Name = "pGenDataGridViewTextBoxColumn";
            // 
            // pNumDataGridViewTextBoxColumn
            // 
            this.pNumDataGridViewTextBoxColumn.DataPropertyName = "pNum";
            this.pNumDataGridViewTextBoxColumn.HeaderText = "연락처";
            this.pNumDataGridViewTextBoxColumn.Name = "pNumDataGridViewTextBoxColumn";
            // 
            // pAddressDataGridViewTextBoxColumn
            // 
            this.pAddressDataGridViewTextBoxColumn.DataPropertyName = "pAddress";
            this.pAddressDataGridViewTextBoxColumn.HeaderText = "주소";
            this.pAddressDataGridViewTextBoxColumn.Name = "pAddressDataGridViewTextBoxColumn";
            // 
            // pVisitDataGridViewTextBoxColumn
            // 
            this.pVisitDataGridViewTextBoxColumn.DataPropertyName = "pVisit";
            this.pVisitDataGridViewTextBoxColumn.HeaderText = "최근방문";
            this.pVisitDataGridViewTextBoxColumn.Name = "pVisitDataGridViewTextBoxColumn";
            // 
            // pDiagnosisDataGridViewTextBoxColumn
            // 
            this.pDiagnosisDataGridViewTextBoxColumn.DataPropertyName = "pDiagnosis";
            this.pDiagnosisDataGridViewTextBoxColumn.HeaderText = "최근진단";
            this.pDiagnosisDataGridViewTextBoxColumn.Name = "pDiagnosisDataGridViewTextBoxColumn";
            this.pDiagnosisDataGridViewTextBoxColumn.Visible = false;
            // 
            // pMedicineDataGridViewTextBoxColumn
            // 
            this.pMedicineDataGridViewTextBoxColumn.DataPropertyName = "pMedicine";
            this.pMedicineDataGridViewTextBoxColumn.HeaderText = "최근 처방";
            this.pMedicineDataGridViewTextBoxColumn.Name = "pMedicineDataGridViewTextBoxColumn";
            this.pMedicineDataGridViewTextBoxColumn.Visible = false;
            // 
            // PatientInfo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(496, 537);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.groupBox1);
            this.Name = "PatientInfo";
            this.Text = "PatientInfo";
            this.groupBox1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView_PatientList)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.patientBindingSource)).EndInit();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.treatBindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBox_Visit;
        private System.Windows.Forms.TextBox textBox_Address;
        private System.Windows.Forms.TextBox textBox_Phone;
        private System.Windows.Forms.TextBox textBox_Gender;
        private System.Windows.Forms.TextBox textBox_Name;
        private System.Windows.Forms.DataGridView dataGridView_PatientList;
        private System.Windows.Forms.Button button_modify;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox textBox_PCode;
        private System.Windows.Forms.DataGridViewTextBoxColumn ageDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource patientBindingSource;
        private System.Windows.Forms.Button button_Reset;
        private System.Windows.Forms.TextBox textBox_Birth;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.DataGridViewTextBoxColumn pCodeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn birthDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn genderDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn addressDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn phoneNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn visitDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn chartNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn pNameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pBirthDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pGenDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pNumDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pAddressDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pVisitDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pDiagnosisDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn pMedicineDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource treatBindingSource;
    }
}