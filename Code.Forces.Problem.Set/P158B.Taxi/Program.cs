using System;

namespace P158B.Taxi
{
	class Program
	{
		static void Main(string[] args)
		{
			int n = int.Parse(Console.ReadLine());
			short[] s = new short[n];
			string[] tokens = Console.ReadLine().Split();
			int[] groups = new int[5] { 0, 0, 0, 0, 0 };

			for (int i = 0; i < n; i++)
			{
				s[i] = short.Parse(tokens[i]);
				groups[s[i]]++;
			}

			int sum = groups[4] + groups[2] / 2;

			if (groups[1] < groups[3])
			{
				sum += groups[1];
			}
			else
			{
				sum += groups[3];
			}

			if (groups[2] % 2 == 0)
			{
				if (groups[1] > groups[3])
				{
					int k = groups[1] - groups[3];
					sum += k / 4;

					if (k % 4 != 0)
					{
						sum++;
					}
				}
				else
				{
					int k = groups[3] - groups[1];
					sum += k;
				}
			}
			else
			{
				if (groups[1] > groups[3])
				{
					int k = groups[1] - groups[3];
					sum++;

					if (k > 2)
					{
						k -= 2;
						sum += k / 4;

						if (k % 4 != 0)
						{
							sum++;
						}
					}
				}
				else
				{
					int k = groups[3] - groups[1];
					sum += k + 1;
				}
			}

			Console.WriteLine(sum);
		}
	}
}
