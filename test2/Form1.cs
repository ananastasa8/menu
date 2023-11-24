using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace test2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox3.Text = (reverse(int.Parse(textBox1.Text)) - int.Parse(textBox2.Text)).ToString();

            int a = int.Parse(textBox1.Text);
            int b = int.Parse(textBox2.Text);
            if (a > b)
                textBox3.Text = (reverse(a) - b).ToString();
            else if (a < b)
                textBox3.Text = (reverse(b) - a).ToString();
            else if (a < 0)
                textBox3.Text = ToPulus(reverse(a) + b).ToString();
            else if (b < 0)
                textBox3.Text = ToPulus(reverse(b) + a).ToString();

        }

        private int reverse(int x)
        {
            string result = "";
            int xleng = char_in_s(x);
            for (int i = 0; i < xleng; i++)
            {
                result = result + (x % 10).ToString();
                x /= 10;
            }
            return int.Parse(result);
        }

        private int char_in_s(int n)
        {
            if (n < 10) return 1;
            return 1 + char_in_s(n / 10);
        }

        private int ToPulus(int a) {
            return Convert.ToInt32(Math.Sqrt(Math.Pow(a,2)));

        }

    }
}
