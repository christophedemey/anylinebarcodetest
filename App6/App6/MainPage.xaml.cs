using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace App6
{
    // Learn more about making custom code visible in the Xamarin.Forms previewer
    // by visiting https://aka.ms/xamarinforms-previewer
    [DesignTimeVisible(true)]
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            btnGoBarcode.Clicked += BtnGoBarcode_Clicked;
        }
        private void BtnGoBarcode_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new ScanPage());
        }
    }
}
