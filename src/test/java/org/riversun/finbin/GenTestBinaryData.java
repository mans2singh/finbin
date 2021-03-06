/*  finbin - Hi-speed search byte[] data from big byte[]
 *
 *  Copyright (c) 2015 Tom Misawa(riversun.org@gmail.com)
 *  
 *  Permission is hereby granted, free of charge, to any person obtaining a
 *  copy of this software and associated documentation files (the "Software"),
 *  to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense,
 *  and/or sell copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 *  DEALINGS IN THE SOFTWARE.
 *  
 */
package org.riversun.finbin;

import java.io.File;

/**
 * 
 * Binary file generator for Test<br>
 * Tom Misawa (riversun.org@gmail.com)
 */
public class GenTestBinaryData {

	public static void main(String[] args) {

		// please edit
		final int size = 64 * 1024;

		// please edit
		final String filepath = "src/test/resources/finbin_test_064kbyte.bin";

		// please edit
		final int step = 5000;

		byte[] testBinary = new byte[size];

		byte[] textBytes = BinaryUtil.getBytes("hello world.");

		// place binary token to search
		for (int i = 0; i < testBinary.length; i += step) {
			BinaryUtil.memcopy(testBinary, textBytes, i);
		}

		// save to file
		BinaryUtil.saveBytesToFile(testBinary, new File(filepath));

	}
}
