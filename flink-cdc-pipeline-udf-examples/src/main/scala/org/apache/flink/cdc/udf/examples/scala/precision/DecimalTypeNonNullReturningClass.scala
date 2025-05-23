/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.cdc.udf.examples.scala.precision

import org.apache.flink.cdc.common.data.DecimalData
import org.apache.flink.cdc.common.types.{DataType, DataTypes}
import org.apache.flink.cdc.common.udf.UserDefinedFunction

import java.math.BigDecimal

/** This is an example UDF class for testing purposes only. */
class DecimalTypeNonNullReturningClass extends UserDefinedFunction {
  override def getReturnType: DataType = DataTypes.DECIMAL(10, 3).notNull()
  def eval: DecimalData = DecimalData.fromBigDecimal(new BigDecimal("12.315"), 10, 3)
}
