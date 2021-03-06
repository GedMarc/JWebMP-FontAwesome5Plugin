/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.fontawesome5;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.fontawesome5.config.FontAwesome5PageConfigurator;
import com.jwebmp.plugins.fontawesome5.icons.FontAwesomeBrandIcons;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeDisplayOptions;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeSizes;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeStyles;
import com.jwebmp.plugins.fontawesome5.options.FontAwesomeTransforms;
import jakarta.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.guicedee.guicedinjection.json.StaticStrings.STRING_SPACE;

/**
 * The FontAwesome project.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 21 May 2016
 */
@SuppressWarnings("unused")
@ComponentInformation(name = "Font Awesome 5",
		description = "The font awesome tag",
		url = "www.fontawesome.com")
public class FontAwesome<J extends FontAwesome<J>>
		extends Italic<J>
		implements IFontAwesome<J>,IIcon<IComponentHierarchyBase<?,?>, J>
{


	private FontAwesomeStyles style;
	private IFontAwesomeIcon icon;

	/**
	 * Construct a new instant of a font awesome icon
	 *
	 * @param icon
	 */
	public FontAwesome(FontAwesomeStyles style, IFontAwesomeIcon icon)
	{
		this.style = style;
		this.icon = icon;
	}

	/**
	 * A blank no icon italic tag
	 */
	public FontAwesome()
	{
		//No config required
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 * @param size
	 * 		The size to use
	 *
	 * @return The new font awesome icon
	 */
	public static FontAwesome<?> icon(IFontAwesomeIcon icon, FontAwesomeSizes size)
	{
		return new FontAwesome<>().setSize(size)
		                        .setIcon(icon)
		                        .setStyle(FontAwesomeStyles.Solid);
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(FontAwesomeSizes size)
	{
		addClass(size);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J spin()
	{
		addClass(FontAwesomeDisplayOptions.Spin);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J pulse()
	{
		addClass(FontAwesomeDisplayOptions.Pulse);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J pullRight()
	{
		addClass(FontAwesomeDisplayOptions.PullRight);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J pullLeft()
	{
		addClass(FontAwesomeDisplayOptions.PullLeft);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J border()
	{
		addClass(FontAwesomeDisplayOptions.Border);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J fixedWidth()
	{
		addClass(FontAwesomeDisplayOptions.FixedWidth);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J transform(FontAwesomeTransforms... transforms)
	{
		StringBuilder attributeValue = new StringBuilder(StringUtils.trimToEmpty(getAttributes().get("data-fa-transform")));
		for (FontAwesomeTransforms transform : transforms)
		{
			attributeValue.append(transform).append(STRING_SPACE);
		}
		addAttribute("data-fa-transform", attributeValue.toString());
		return (J) this;
	}

	@Override
	public FontAwesomeStyles getStyle()
	{
		return style;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStyle(FontAwesomeStyles style)
	{
		this.style = style;
		return (J) this;
	}

	@Override
	public IFontAwesomeIcon getIcon()
	{
		return icon;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcon(IFontAwesomeIcon icon)
	{
		this.icon = icon;
		return (J) this;
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 * @param styles
	 * 		The size to use
	 *
	 * @return The new font awesome icon
	 */
	public static FontAwesome<?> icon(IFontAwesomeIcon icon, FontAwesomeStyles styles)
	{
		return new FontAwesome<>().setIcon(icon)
		                        .setStyle(styles);
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 * @param size
	 * 		The size to use
	 *
	 * @return The new font awesome icon
	 */
	public static FontAwesome<?> icon(IFontAwesomeIcon icon, FontAwesomeSizes size, FontAwesomeStyles styles)
	{
		return new FontAwesome<>().setSize(size)
		                        .setIcon(icon)
		                        .setStyle(styles);
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 *
	 * @return The new font awesome icon
	 */
	public static String iconString(IFontAwesomeIcon icon)
	{
		return new FontAwesome<>().setIcon(icon)
		                        .setStyle(FontAwesomeStyles.Solid)
		                        .setTiny(true)
		                        .toString(0);
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 * @param styles
	 * 		The size to use
	 *
	 * @return The new font awesome icon
	 */
	public static String iconString(IFontAwesomeIcon icon, FontAwesomeStyles styles)
	{
		return new FontAwesome<>().setIcon(icon)
		                        .setStyle(styles)
		                        .setTiny(true)
		                        .toString(0);
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 * @param size
	 * 		The size to use
	 *
	 * @return The new font awesome icon
	 */
	public static String iconString(IFontAwesomeIcon icon, FontAwesomeSizes size, FontAwesomeStyles styles)
	{
		return new FontAwesome<>().setSize(size)
		                        .setIcon(icon)
		                        .setStyle(styles)
		                        .setTiny(true)
		                        .toString(0);
	}

	/**
	 * Creates a new icon with the given icon and size in the solid format
	 *
	 * @param icon
	 * 		The icon to apply
	 *
	 * @return The new font awesome icon
	 */
	public static FontAwesome<?> icon(IFontAwesomeIcon icon)
	{
		return new FontAwesome<>().setIcon(icon)
		                        .setStyle(FontAwesomeStyles.Solid);
	}

	/**
	 * Inserts the icon and style classes
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			if (icon != null && FontAwesomeBrandIcons.class.isAssignableFrom(icon.getClass()))
			{
				style = FontAwesomeStyles.Brand;
			}
			if (style == null)
			{
				style = FontAwesomeStyles.Solid;
			}
			Set<String> clazzes = getClasses();
			List<String> ordered = new ArrayList<>(clazzes);
			if (icon != null)
			{
				ordered.add(0, getIcon().toString());
			}
			ordered.add(0, getStyle().toString());
			setClasses(new LinkedHashSet<>(ordered));

			switch (style)
			{
				case Light:
					FontAwesome5PageConfigurator.setIncludeLight(true);
					break;
				case Regular:
					FontAwesome5PageConfigurator.setIncludeRegular(true);
					break;
				case Solid:
					FontAwesome5PageConfigurator.setIncludeSolid(true);
					break;
				case Brand:
					FontAwesome5PageConfigurator.setIncludeBrands(true);
			}

			if (icon.getClass()
			        .isAssignableFrom(FontAwesomeBrandIcons.class))
			{
				FontAwesome5PageConfigurator.setIncludeBrands(true);
			}
		}
		super.preConfigure();
	}

	/**
	 * A smaller neater option for Font Awesome
	 *
	 * @return
	 */
	public IFontAwesome<?> asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return false;
	}

	@Override
	public String getClassName()
	{
		return this.style + " " + this.icon;
	}

	@Override
	public ComponentHierarchyBase<?,?,?,?,?> getIconComponent()
	{
		return this;
	}
}
