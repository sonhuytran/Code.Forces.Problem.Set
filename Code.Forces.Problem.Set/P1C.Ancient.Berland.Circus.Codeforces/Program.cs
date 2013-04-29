using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace P1C.Ancient.Berland.Circus.Codeforces
{
	class Program
	{
		private static double Distance(double x1, double y1, double x2, double y2)
		{
			return Math.Sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		}

		private static double Area(double a, double b, double c)
		{
			return 0;
		}

		static void Main(string[] args)
		{
			string[] input1 = Console.ReadLine().Split(" ".ToCharArray());
			string[] input2 = Console.ReadLine().Split(" ".ToCharArray());
			string[] input3 = Console.ReadLine().Split(" ".ToCharArray());

			double x1 = double.Parse(input1[0]);
			double y1 = double.Parse(input1[1]);
			double x2 = double.Parse(input2[0]);
			double y2 = double.Parse(input2[1]);
			double x3 = double.Parse(input3[0]);
			double y3 = double.Parse(input3[1]);

			double a = Distance(x1, y1, x2, y2);
			double b = Distance(x2, y2, x3, y3);
			double c = Distance(x3, y3, x1, y1);
		}
	}
}
