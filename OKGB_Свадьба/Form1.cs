using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace OKGB_Свадьба
{
    public partial class Form1 : Form
    {

        double babamoney;
        List<double> CucoldMoney = new List<double>();

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            CucoldMoney.Add(Convert.ToDouble(numericUpDown2.Value));
            listBox1.Items.Add(Convert.ToString(numericUpDown2.Value));
        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
            babamoney = Convert.ToDouble(numericUpDown1.Value);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            CucoldMoney.Sort();
            for (int i = 0; i < CucoldMoney.Count; i++)
            {
                babamoney = (babamoney + CucoldMoney[i]) / 2;
            }
           
            listBox1.Items.Clear();
   
            listBox1.Items.Add(Convert.ToString(babamoney));
        }
    }
}
