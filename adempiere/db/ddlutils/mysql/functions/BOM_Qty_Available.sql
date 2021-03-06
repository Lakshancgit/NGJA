 /**********************************************************************
 * This file is part of ADempiere Business Suite                       *
 * http://www.adempiere.org                                            *
 *                                                                     *
 * Copyright (C) Trifon Trifonov.                                      *
 * Copyright (C) Contributors                                          *
 *                                                                     *
 * This program is free software; you can redistribute it and/or       *
 * modify it under the terms of the GNU General Public License         *
 * as published by the Free Software Foundation; either version 2      *
 * of the License, or (at your option) any later version.              *
 *                                                                     *
 * This program is distributed in the hope that it will be useful,     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of      *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the        *
 * GNU General Public License for more details.                        *
 *                                                                     *
 * You should have received a copy of the GNU General Public License   *
 * along with this program; if not, write to the Free Software         *
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,          *
 * MA 02110-1301, USA.                                                 *
 *                                                                     *
 * Contributors:                                                       *
 * - Trifon Trifonov (trifonnt@users.sourceforge.net)                  *
 *                                                                     *
 ***********************************************************************
 * 
 * Title.........: 
 * Description...: Return quantity available for BOM 
 * Test..........: SELECT bomQtyAvailable(106, 100, null)$$  => 0.0000000000
 *                 SELECT bomQtyAvailable(123, 103, 101)$$   => 20.0000000000
 *                 SELECT bomQtyAvailable(123, 103, null)$$  => 20.0000000000
 *                 SELECT bomQtyAvailable(123, null, 101)$$  => 20.0000000000
 *                 SELECT bomQtyAvailable(123, null, null)$$ => 0.0000000000
 *                 SELECT bomQtyAvailable(0, null, 101)$$    => 0.0000000000
 * 
 * Converted to MySQL..: by Trifon Trifonov
 ************************************************************************/

-- ## Drop statement
Drop function IF EXISTS bomQtyAvailable;

DELIMITER $$
-- ## Create statement
CREATE FUNCTION bomQtyAvailable (
  Product_ID     DECIMAL(10, 0),
  Warehouse_ID   DECIMAL(10, 0),
  Locator_ID     DECIMAL(10, 0) -- Only used, if warehouse is null
)
  RETURNS DECIMAL(20, 10)
  DETERMINISTIC
BEGIN
  RETURN bomQtyOnHand(Product_ID, Warehouse_ID, Locator_ID)
       - bomQtyReserved(Product_ID, Warehouse_ID, Locator_ID);
END$$
DELIMITER ;