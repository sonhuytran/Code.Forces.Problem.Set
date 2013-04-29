using System;

namespace P71A.Way.Too.Long.Words.Codeforces
{
	class Program
	{
		static void Main(string[] args)
		{
			int n = int.Parse(Console.ReadLine());

			while (n > 0)
			{
				string input = Console.ReadLine();
				
				if (input.Length > 10)
				{
					Console.Write(input[0]);
					Console.Write(input.Length - 2);
					Console.Write(input[input.Length - 1]);
					Console.WriteLine();
				}
				else
				{
					Console.WriteLine(input);
				}

				n--;
			}
		}
	}
}
