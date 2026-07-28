using System.Diagnostics;

class Program
{
    static void Main()
    {
        var p = new Process();
        p.StartInfo.FileName = "explorer.exe";
        p.StartInfo.Arguments = "https://taikenle.github.io/reptile/reptile-app.html";
        p.StartInfo.UseShellExecute = false;
        p.Start();
    }
}
