using System;

namespace P1A.Theatre.Square.Console
{
	public class TheatreSquare
	{
		private int n;
		private int m;
		private int a;

		private static readonly int nMin = 1;
		private static readonly int nMax = 109;
		private static readonly int mMin = 1;
		private static readonly int mMax = 109;
		private static readonly int aMin = 1;
		private static readonly int aMax = 109;

		public TheatreSquare(int n, int m, int a)
		{
			if (n < nMin || n > nMax)
			{
				throw new ArgumentException("Invalid n value", "n");
			}

			if (m < mMin || m > mMax)
			{
				throw new ArgumentException("Invalid m value", "m");
			}

			if (a < aMin || a > aMax)
			{
				throw new ArgumentException("Invalid a value", "a");
			}

			this.n = n;
			this.m = m;
			this.a = a;
		}

		public long GetNFlagstone()
		{
			int flagstoneN = n / a;

			if (n % a != 0)
			{
				flagstoneN++;
			}

			int flagstoneM = m / a;

			if (m % a != 0)
			{
				flagstoneM++;
			}

			return flagstoneN * flagstoneM;
		}
	}

	class Program
	{
		private static bool GetInputs(string input, out int n, out int m, out int a)
		{
			try
			{
				string[] inputs = input.Split(" ".ToCharArray(),
					StringSplitOptions.RemoveEmptyEntries);

				n = int.Parse(inputs[0]);
				m = int.Parse(inputs[1]);
				a = int.Parse(inputs[2]);

				return true;
			}
			catch (Exception)
			{
				n = 1;
				m = 1;
				a = 1;

				throw new ArgumentException("Invalid input values",
					"n, m, a");
			}
		}

		static void Main(string[] args)
		{
			string inputs = System.Console.ReadLine();
			
			int n = 0, m = 0, a = 0;

			try
			{
				GetInputs(inputs, out n, out m, out a);
				TheatreSquare theatreSquareProblem = new TheatreSquare(n, m, a);
				System.Console.WriteLine(theatreSquareProblem.GetNFlagstone());
			}
			catch (ArgumentException ex)
			{
				System.Console.WriteLine(ex.Message);
			}
			catch (Exception ex)
			{
				System.Console.WriteLine(ex.Message);
				throw;
			}
		}
	}
}
