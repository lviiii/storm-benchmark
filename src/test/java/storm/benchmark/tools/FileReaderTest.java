/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package storm.benchmark.tools;

import org.testng.annotations.Test;
import storm.benchmark.tools.FileReader;

import static org.fest.assertions.api.Assertions.assertThat;

public class FileReaderTest {
  private static final String FILE = "/resources/test.txt";

  @Test
  public void testNextLine() {
    FileReader reader = new FileReader(FILE);
    assertThat(reader.nextLine()).isEqualTo("first line");
    assertThat(reader.nextLine()).isEqualTo("second line");
    assertThat(reader.nextLine()).isEqualTo("third line");
    assertThat(reader.nextLine()).isEqualTo("first line");
  }

}
