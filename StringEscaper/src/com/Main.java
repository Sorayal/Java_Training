package com;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(escapePropertyValue("D--+poohhf1Thgö61X+49Tr,-fA765h5"));
    }

    public static String escapePropertyValue(final String value) {
        if (value == null) {
            return null;
        }

        try (final StringWriter writer = new StringWriter()) {
            final Properties properties = new Properties();
            properties.put("escaped", value);
            properties.store(writer, null);
            writer.flush();

            final String stringifiedProperties = writer.toString();
            final Pattern pattern = Pattern.compile("(.*?)escaped=(.*?)" + Pattern.quote(System.lineSeparator()) + "*");
            final Matcher matcher = pattern.matcher(stringifiedProperties);

            if (matcher.find() && matcher.groupCount() <= 2) {
                return matcher.group(matcher.groupCount());
            }

            // This should never happen unless the internal implementation of Properties::store changed
            throw new IllegalStateException("Could not escape property value");
        } catch (final IOException ex) {
            // This should never happen. IOException is only because the interface demands it
            throw new IllegalStateException("Could not escape property value", ex);
        }
    }
}
