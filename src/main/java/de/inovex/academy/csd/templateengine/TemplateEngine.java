package de.inovex.academy.csd.templateengine;

import java.util.Map;

public class TemplateEngine {

	private String tmpl;

	public TemplateEngine(String tmpl) {
		this.tmpl = tmpl;
	}

	public String render(Map<String, String> params) throws IllegalArgumentException {
		StringBuilder sb = new StringBuilder(this.tmpl);

		for (Map.Entry<String, String> entry : params.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			replace(sb, key, value);
		}

		checkPostconditions(sb);

		return sb.toString();
	}

	private void replace(StringBuilder sb, String key, String value) throws IllegalArgumentException {
		String toSearch = "${" + key + "}";
		int start = sb.indexOf(toSearch);
		if (start < 0) {
			throw new IllegalArgumentException("Key " + key + " not found");
		}
		int end = start + toSearch.length();
		sb.replace(start, end, value);
	}

	private void checkPostconditions(StringBuilder filledTemplate) throws IllegalArgumentException {
		if (filledTemplate.toString().matches(".*[$][{][^}]+[}].*")) {
			throw new IllegalArgumentException("Unmatched variables!");
		}
	}

}
