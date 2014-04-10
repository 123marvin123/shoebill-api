/**
 * Copyright (C) 2011 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.dialog;

import net.gtaun.shoebill.object.DialogId;
import net.gtaun.shoebill.object.Player;

/**
 * 
 * 
 * @author MK124
 */
public class DialogCancelEvent extends DialogEvent
{
	public enum DialogCancelType
	{
		CANCEL,
		OVERRIDE,
	}
	
	
	private DialogCancelType type;
	
	
	public DialogCancelEvent(DialogId dialog, Player player, DialogCancelType type)
	{
		super(dialog, player);
		this.type = type;
	}
	
	public DialogCancelType getType()
	{
		return type;
	}
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	public void setProcessed()
	{
		interrupt();
	}
}
