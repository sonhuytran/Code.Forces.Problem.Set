using System;

namespace P4A.Watermelon.Codeforces
{
	class Program
	{
		static int Main(string[] args)
		{
			short weight = short.Parse(Console.ReadLine());

			if (weight == 2
				|| weight % 2 != 0)
			{
				Console.WriteLine("NO");
				return 0;
			}

			Console.WriteLine("YES");

			return 0;
		}
	}
}
