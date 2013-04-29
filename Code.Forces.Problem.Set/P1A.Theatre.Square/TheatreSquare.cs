using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace P1A.Theatre.Square
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
				throw new ArgumentException(Properties.Resources.invalid_n, "n");
			}

			if (m < mMin || m > mMax)
			{
				throw new ArgumentException(Properties.Resources.invalid_m, "m");
			}

			if (a < aMin || a > aMax)
			{
				throw new ArgumentException(Properties.Resources.invalid_a, "a");
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
}
