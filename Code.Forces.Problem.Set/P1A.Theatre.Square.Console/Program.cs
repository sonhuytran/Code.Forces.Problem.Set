using System;

namespace P1A.Theatre.Square.Console
{
	public class TheatreSquare
	{
		private long n;
		private long m;
		private long a;

		private static readonly long nMin = 1;
		private static readonly long nMax = 1000000000;
		private static readonly long mMin = 1;
		private static readonly long mMax = 1000000000;
		private static readonly long aMin = 1;
		private static readonly long aMax = 1000000000;

		public TheatreSquare(long n, long m, long a)
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
			long flagstoneN = n / a;

			if (n % a != 0)
			{
				flagstoneN++;
			}

			long flagstoneM = m / a;

			if (m % a != 0)
			{
				flagstoneM++;
			}

			return flagstoneN * flagstoneM;
		}
	}

	class Program
	{
		private static bool GetInputs(string input, out long n, out long m, out long a)
		{
			try
			{
				string[] inputs = input.Split(" ".ToCharArray(),
					StringSplitOptions.RemoveEmptyEntries);

				n = long.Parse(inputs[0]);
				m = long.Parse(inputs[1]);
				a = long.Parse(inputs[2]);

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
			
			long n = 0, m = 0, a = 0;

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
