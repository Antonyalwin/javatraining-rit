public class usercode
{
    public string SecondWordUpperCase(string input1)
{
    string[] words = input1.Split(' ');

    if (words.Length < 2)
    {
        return "LESS";
    }
    else
    {
        string secondWord = words[1].ToUpper().Trim();
        return secondWord;
    }
}
}