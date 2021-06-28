package hu.webuni.hr.csucsi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class HrConfigProperties {
	
	private Raise raise = new Raise();
	
	public Raise getRaise() {
		return raise;
	}

	public void setRaise(Raise raise) {
		this.raise = raise;
	}

	public static class Raise{
		private Default def = new Default();
		private Smart smart = new Smart();
		private Years year = new Years();
		
		public Years getYear() {
			return year;
		}
		public void setYear(Years year) {
			this.year = year;
		}
		public Default getDef() {
			return def;
		}
		public void setDef(Default def) {
			this.def = def;
		}
		public Smart getSmart() {
			return smart;
		}
		public void setSmart(Smart smart) {
			this.smart = smart;
		}
		
	}
				
	public static class Default{
		private int percent;
		
		public int getPercent() {
			return percent;
		}

		public void setPercent(int percent) {
			this.percent = percent;
		}
	}
	
	public static class Smart{
		private double[] limits;
		private int[] raiseLimits;
		
		public int[] getRaiseLimits() {
			return raiseLimits;
		}
		public void setRaiseLimits(int[] raiseLimits) {
			this.raiseLimits = raiseLimits;
		}
		public double[] getLimits() {
			return limits;
		}
		public void setLimits(double[] limits) {
			this.limits = limits;
		}
	}
	
	public static class Years{
		private int[] yearsArray;

		public int[] getYearsArray() {
			return yearsArray;
		}

		public void setYearsArray(int[] yearsArray) {
			this.yearsArray = yearsArray;
		}
	}

}
