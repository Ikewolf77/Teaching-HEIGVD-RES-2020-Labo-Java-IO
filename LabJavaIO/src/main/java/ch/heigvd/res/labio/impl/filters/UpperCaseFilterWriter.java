package ch.heigvd.res.labio.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
    str = str.toUpperCase();
    out.write(str,off,len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    String res = new String();

    for(char c : cbuf)
      res += c;

    write(res,off,len);
  }

  @Override
  public void write(int c) throws IOException {
    out.write(Character.toUpperCase((char)c));
  }

}
