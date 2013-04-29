using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace P158A.Next.Round
{
	class Program
	{
		static void Main(string[] args)
		{
			string[] tokens = Console.ReadLine().Split();
			short n = short.Parse(tokens[0]);
			short k = short.Parse(tokens[1]);

			tokens = Console.ReadLine().Split(" ".ToCharArray());
			short[] inputs = new short[n];

			for (int i = 0; i < n; i++)
			{
				inputs[i] = short.Parse(tokens[i]);
			}

			int j = 0;
			int kresult = inputs[k - 1];

			while (j < n
				&& inputs[j] > 0
				&& inputs[j] >= kresult)
			{
				j++;
			}

			Console.WriteLine(j);
		}
	}
}
