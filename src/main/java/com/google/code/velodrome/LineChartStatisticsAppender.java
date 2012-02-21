package com.google.code.velodrome;

import org.perf4j.chart.GoogleChartGenerator;
import org.perf4j.chart.StatisticsChartGenerator;
import org.perf4j.log4j.GraphingStatisticsAppender;

public class LineChartStatisticsAppender extends GraphingStatisticsAppender {
	private int width = 1960;
	private int height = 1560;

	/**
	 * create google chart generator enriched with width and height parameters.
	 * 
	 * @return google chart generator
	 */
	@Override
	protected StatisticsChartGenerator createChartGenerator() {
		GoogleChartGenerator chartGenerator = (GoogleChartGenerator) super
				.createChartGenerator();
		chartGenerator.setWidth(width);
		chartGenerator.setHeight(height);
		return super.createChartGenerator();
	}

	/**
	 * set max width of google chart
	 * 
	 * @param width
	 *            value
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * set max height of google chart
	 * 
	 * @param height
	 *            value
	 */
	public void setHeight(int height) {
		this.height = height;
	}
}
