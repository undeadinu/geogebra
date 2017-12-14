package org.geogebra.common.main;

public enum Feature {
	ALL_LANGUAGES,

	LOCALSTORAGE_FILES,

	TUBE_BETA,

	EXERCISES,

	TOOL_EDITOR,

	POLYGON_TRIANGULATION,

	DATA_COLLECTION,

	IMPLICIT_SURFACES,

	CONTOUR_PLOT_COMMAND,

	LOG_AXES,

	HIT_PARAMETRIC_SURFACE,

	PARAMETRIC_SURFACE_IS_REGION,

	EXAM_TABLET,

	ACRA,

	ANALYTICS,

	SAVE_SETTINGS_TO_FILE,

	HANDWRITING,

	AV_DEFINITION_AND_VALUE,

	CONVEX_HULL_3D,

	/** MOB-637 */
	DIFFERENT_AXIS_RATIO_3D,

	/** GGB-334, TRAC-3401 */
	ADJUST_WIDGETS,

	/** GGB-944 */
	EXPORT_ANIMATED_PDF,

	/** GGB-776 */
	ABSOLUTE_TEXTS,

	/** MOB-788 */
	MOBILE_USE_FBO_FOR_3D_IMAGE_EXPORT,

	/** GGB-1263 */
	AUTOSCROLLING_SPREADSHEET,

	/** GGB-1252 */
	KEYBOARD_BEHAVIOUR,

	/** MOW */
	WHITEBOARD_APP,

	/**
	 * GGB-1398 + GGB-1529
	 */
	SHOW_ONE_KEYBOARD_BUTTON_IN_FRAME,

	/** MOW-97 */
	ERASER, ROUNDED_POLYGON,

	/** MOW-175 */
	MOW_CONTEXT_MENU,

	/** MOV-169 */
	DYNAMIC_STYLEBAR,

	/** MOW-29 */
	MOW_TOOLBAR,

	MOW_PEN_IS_LOCUS,

	MOW_PEN_EVENTS,

	/** MOW-105 */
	MOW_PEN_SMOOTHING,

	/** GGB-1617 */
	AUTOMATIC_DERIVATIVES,

	/** SolveQuartic in CAS GGB-1635 */
	SOLVE_QUARTIC,

	/** MOW-166 */
	MOW_AXES_STYLE_SUBMENU,

	/** MOW-55 */
	MOW_BOUNDING_BOXES,

	/** MOW-239 */
	MOW_IMPROVE_CONTEXT_MENU,

	/** MOW-251, MOW-197 */
	MOW_CLEAR_VIEW_STYLEBAR,

	/** MOW-197 */
	MOW_COLORPOPUP_IMPROVEMENTS,

	/** MOW-88 */
	MOW_DIRECT_FORMULA_CONVERSION,

	/** MOB-1305 */
	MOB_KEYBOARD_BOX_ICONS,

	/** GGB-1697 */
	AV_ITEM_DESIGN,

	/** Dynamic stylebar added for locked geos too */
	LOCKED_GEO_HAVE_DYNAMIC_STYLEBAR,

	EXPORT_SCAD,

	/** GGB-1876 */
	DOUBLE_ROUND_BRACKETS,

	/** GGB-1708 */
	INPUT_BAR_ADD_SLIDER,

	/** GGB-1916 */
	DEFAULT_OBJECT_STYLES,
	
	/** GGB-2008 */
	OBJECT_DEFAULTS_AND_COLOR,

	SHOW_STEPS,

	/** GGB-1907 */
	DYNAMIC_STYLEBAR_SELECTION_TOOL,

	/** GGB-1910 */
	LABEL_SETTING_ON_STYLEBAR,

	/** GGB-1966 */
	FUNCTIONS_DYNAMIC_STYLEBAR_POSITION,

	CENTER_STANDARD_VIEW,

	SURFACE_2D,

	/** GGB-1970*/
	ARROW_OUTPUT_PREFIX,

	/** GGB-1982 */
	OPENING_DYNAMIC_STYLEBAR_ON_FIXED_GEOS,

	/** GGB-1985*/
	FLOATING_SETTINGS,

	/** GGB-2005 */
	TOOLTIP_DESIGN,

	/** GGB-1986 */
	DIALOG_DESIGN,

	INITIAL_PORTRAIT,

	/** MOW-261 */
	MOW_COLOR_FILLING_LINE,

	/** MOW-269 */
	MOW_MULTI_PAGE,

	/** GGB-2015 */
	GEO_AV_DESCRIPTION,

	/**
	 * AND-364
	 */
	MOB_EV_SETTINGS_POPUP,

	/** AND-465 */
	MOB_DYNAMIC_SYLEBAR,

	/** GGB-2053 */
	TAB_ON_GUI,

	/** MOB-1293 */
	SELECT_TOOL_NEW_BEHAVIOUR,

	/** AND-574 */
	MOB_NO_LOCK_FOR_PREVIEWABLE_IN_AND_3D,

	/** GGB-2118 */
	PREVIEW_POINTS,

	/** IGR-481 */
	MOB_LINKS_TO_OTHER_APPS_IN_IOS, 
	
	/** GGB-2127 */
	UNBUNDLED_3D_APP,

	/** AND-617 */
	MOB_INPUT_CONTEXT_MENU,

	/** GGB-2169 */
	CENTER_IMAGE,

	/** GGB-2183 change sin(15) -> sin(15deg) */
	AUTO_ADD_DEGREE,

	/** GGB-2222 change asin(0.5) -> asind(0.5) */
	CHANGE_INVERSE_TRIG_TO_DEGREES,

	/** GGB-2170 for k12 */
	SLIDER_STYLE_OPTIONS,

	/** GGB-2178 */
	RELATIVE_POSITION_FURNITURE,

	/** MOB-1310 */
	SHOW_HIDE_LABEL_OBJECT_DELETE_MULTIPLE,

	/** IGR-373 */
	MOB_TRANSPARENT_STATUS_BAR_IN_EXAM_MODE,

	/** MOB-1319 */
	MOB_NOTIFICATION_BAR_TRIGGERS_EXAM_ALERT_IOS_11,

	/** GGB-2208 */
	CAS_FROM_TO_BASE,

	/** MOB-1313 */
	MOB_STANDARD_VIEW_BUTTON_3D,

	/** MOB-1329 */
	MOB_PACK_BUFFERS_3D,

	/** GGB-2203 */
	HELP_AND_SHORTCUTS,

	/** GGB-2203 */
	HELP_AND_SHORTCUTS_IMPROVEMENTS,

	/** GGB-2204 */
	TAB_ON_MENU,

	/** GGB-2204 */
	ARIA_MENU,

	/** GGB-2215 */
	ARIA_CONTEXT_MENU,

	/** GGB-2100 */
	KEYBOARD_BOX_ICON,

	/** AND-637 */
	MOB_GGB_KEYBOARD_IN_SETTINGS,

	/** IGR-546 */
	MOB_IOS_SINGLE_APP_MODE,

	/** AND-623 */
	MOB_SYNC_BKG_SERVICE
}

