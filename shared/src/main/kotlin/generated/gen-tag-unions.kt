package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

interface FlowOrHeadingContent : Tag {
}

interface FlowOrMetaDataContent : FlowOrPhrasingOrMetaDataContent, Tag {
}

interface FlowOrInteractiveContent : FlowOrInteractiveOrPhrasingContent, Tag {
}

interface FlowOrPhrasingContent : FlowOrInteractiveOrPhrasingContent, FlowOrPhrasingOrMetaDataContent, Tag {
}

interface FlowOrPhrasingOrMetaDataContent : Tag {
}

interface SectioningOrFlowContent : Tag {
}

interface FlowOrInteractiveOrPhrasingContent : Tag {
}



/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h1(classes : String? = null, block : H1.() -> Unit = {}) : Unit = H1(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h2(classes : String? = null, block : H2.() -> Unit = {}) : Unit = H2(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h3(classes : String? = null, block : H3.() -> Unit = {}) : Unit = H3(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h4(classes : String? = null, block : H4.() -> Unit = {}) : Unit = H4(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h5(classes : String? = null, block : H5.() -> Unit = {}) : Unit = H5(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Heading
 */
@HtmlTagMarker
fun FlowOrHeadingContent.h6(classes : String? = null, block : H6.() -> Unit = {}) : Unit = H6(attributesMapOf("class", classes), consumer).visit(block)

@HtmlTagMarker
fun FlowOrHeadingContent.hGroup(classes : String? = null, block : HGROUP.() -> Unit = {}) : Unit = HGROUP(attributesMapOf("class", classes), consumer).visit(block)


/**
 * Style info
 */
@HtmlTagMarker
fun FlowOrMetaDataContent.style(type : String? = null, block : STYLE.() -> Unit = {}) : Unit = STYLE(attributesMapOf("type", type), consumer).visit(block)
@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Style info
 */
@HtmlTagMarker
fun FlowOrMetaDataContent.style(type : String? = null, content : String = "") : Unit = STYLE(attributesMapOf("type", type), consumer).visit({+content})


/**
 * Disclosure control for hiding details
 */
@HtmlTagMarker
fun FlowOrInteractiveContent.details(classes : String? = null, block : DETAILS.() -> Unit = {}) : Unit = DETAILS(attributesMapOf("class", classes), consumer).visit(block)


/**
 * Abbreviated form (e.g., WWW, HTTP,etc.)
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.abbr(classes : String? = null, block : ABBR.() -> Unit = {}) : Unit = ABBR(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Client-side image map area
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.area(shape : AreaShape? = null, alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : Unit = AREA(attributesMapOf("Shape", shape?.enumEncode(),"alt", alt,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingContent.rectArea(alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : Unit = AREA(attributesMapOf("Shape", AreaShape.rect.realValue,"alt", alt,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingContent.circleArea(alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : Unit = AREA(attributesMapOf("Shape", AreaShape.circle.realValue,"alt", alt,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingContent.polyArea(alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : Unit = AREA(attributesMapOf("Shape", AreaShape.poly.realValue,"alt", alt,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingContent.defaultArea(alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : Unit = AREA(attributesMapOf("Shape", AreaShape.default.realValue,"alt", alt,"class", classes), consumer).visit(block)

/**
 * Bold text style
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.b(classes : String? = null, block : B.() -> Unit = {}) : Unit = B(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Text directionality isolation
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.bdi(classes : String? = null, block : BDI.() -> Unit = {}) : Unit = BDI(attributesMapOf("class", classes), consumer).visit(block)

/**
 * I18N BiDi over-ride
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.bdo(classes : String? = null, block : BDO.() -> Unit = {}) : Unit = BDO(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Forced line break
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.br(classes : String? = null, block : BR.() -> Unit = {}) : Unit = BR(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.canvas(classes : String? = null, block : CANVAS.() -> Unit = {}) : Unit = CANVAS(attributesMapOf("class", classes), consumer).visit(block)
/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.canvas(classes : String? = null, content : String = "") : Unit = CANVAS(attributesMapOf("class", classes), consumer).visit({+content})

/**
 * Citation
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.cite(classes : String? = null, block : CITE.() -> Unit = {}) : Unit = CITE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Computer code fragment
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.code(classes : String? = null, block : CODE.() -> Unit = {}) : Unit = CODE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Container for options for 
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.dataList(classes : String? = null, block : DATALIST.() -> Unit = {}) : Unit = DATALIST(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Deleted text
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.del(classes : String? = null, block : DEL.() -> Unit = {}) : Unit = DEL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Instance definition
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.dfn(classes : String? = null, block : DFN.() -> Unit = {}) : Unit = DFN(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Emphasis
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.em(classes : String? = null, block : EM.() -> Unit = {}) : Unit = EM(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Italic text style
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.i(classes : String? = null, block : I.() -> Unit = {}) : Unit = I(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Inserted text
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.ins(classes : String? = null, block : INS.() -> Unit = {}) : Unit = INS(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Text to be entered by the user
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.kbd(classes : String? = null, block : KBD.() -> Unit = {}) : Unit = KBD(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Client-side image map
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.map(name : String? = null, classes : String? = null, block : MAP.() -> Unit = {}) : Unit = MAP(attributesMapOf("name", name,"class", classes), consumer).visit(block)

/**
 * Highlight
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.mark(classes : String? = null, block : MARK.() -> Unit = {}) : Unit = MARK(attributesMapOf("class", classes), consumer).visit(block)

@HtmlTagMarker
fun FlowOrPhrasingContent.math(classes : String? = null, block : MATH.() -> Unit = {}) : Unit = MATH(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Gauge
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.meter(classes : String? = null, block : METER.() -> Unit = {}) : Unit = METER(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Calculated output value
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.output(classes : String? = null, block : OUTPUT.() -> Unit = {}) : Unit = OUTPUT(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Progress bar
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.progress(classes : String? = null, block : PROGRESS.() -> Unit = {}) : Unit = PROGRESS(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Short inline quotation
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.q(classes : String? = null, block : Q.() -> Unit = {}) : Unit = Q(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Ruby annotation(s)
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.ruby(classes : String? = null, block : RUBY.() -> Unit = {}) : Unit = RUBY(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Strike-through text style
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.samp(classes : String? = null, block : SAMP.() -> Unit = {}) : Unit = SAMP(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Small text style
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.small(classes : String? = null, block : SMALL.() -> Unit = {}) : Unit = SMALL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Generic language/style container
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.span(classes : String? = null, block : SPAN.() -> Unit = {}) : Unit = SPAN(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Strong emphasis
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.strong(classes : String? = null, block : STRONG.() -> Unit = {}) : Unit = STRONG(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Subscript
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.sub(classes : String? = null, block : SUB.() -> Unit = {}) : Unit = SUB(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Superscript
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.sup(classes : String? = null, block : SUP.() -> Unit = {}) : Unit = SUP(attributesMapOf("class", classes), consumer).visit(block)

@HtmlTagMarker
fun FlowOrPhrasingContent.svg(classes : String? = null, block : SVG.() -> Unit = {}) : Unit = SVG(attributesMapOf("class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingContent.svg(classes : String? = null, content : String = "") : Unit = SVG(attributesMapOf("class", classes), consumer).visit({+content})

/**
 * Machine-readable equivalent of date- or time-related data
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.time(classes : String? = null, block : TIME.() -> Unit = {}) : Unit = TIME(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Unordered list
 */
@HtmlTagMarker
fun FlowOrPhrasingContent.htmlVar(classes : String? = null, block : VAR.() -> Unit = {}) : Unit = VAR(attributesMapOf("class", classes), consumer).visit(block)


@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.command(type : CommandType? = null, classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", type?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.commandCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.command.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.checkBoxCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.checkBox.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.radioCommand(classes : String? = null, block : COMMAND.() -> Unit = {}) : Unit = COMMAND(attributesMapOf("type", CommandType.radio.realValue,"class", classes), consumer).visit(block)

/**
 * A media-independent link
 */
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.link(href : String? = null, rel : String? = null, type : String? = null, block : LINK.() -> Unit = {}) : Unit = LINK(attributesMapOf("href", href,"rel", rel,"type", type), consumer).visit(block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.meta(name : String? = null, content : String? = null, charset : String? = null, block : META.() -> Unit = {}) : Unit = META(attributesMapOf("name", name,"content", content,"charset", charset), consumer).visit(block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.noScript(classes : String? = null, block : NOSCRIPT.() -> Unit = {}) : Unit = NOSCRIPT(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Script statements
 */
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.script(type : String? = null, src : String? = null, block : SCRIPT.() -> Unit = {}) : Unit = SCRIPT(attributesMapOf("type", type,"src", src), consumer).visit(block)
@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Script statements
 */
@HtmlTagMarker
fun FlowOrPhrasingOrMetaDataContent.script(type : String? = null, src : String? = null, content : String = "") : Unit = SCRIPT(attributesMapOf("type", type,"src", src), consumer).visit({+content})


/**
 * Self-contained syndicatable or reusable composition
 */
@HtmlTagMarker
fun SectioningOrFlowContent.article(classes : String? = null, block : ARTICLE.() -> Unit = {}) : Unit = ARTICLE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Sidebar for tangentially related content
 */
@HtmlTagMarker
fun SectioningOrFlowContent.aside(classes : String? = null, block : ASIDE.() -> Unit = {}) : Unit = ASIDE(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Section with navigational links
 */
@HtmlTagMarker
fun SectioningOrFlowContent.nav(classes : String? = null, block : NAV.() -> Unit = {}) : Unit = NAV(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Generic document or application section
 */
@HtmlTagMarker
fun SectioningOrFlowContent.section(classes : String? = null, block : SECTION.() -> Unit = {}) : Unit = SECTION(attributesMapOf("class", classes), consumer).visit(block)


/**
 * Anchor
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.a(href : String? = null, target : String? = null, classes : String? = null, block : A.() -> Unit = {}) : Unit = A(attributesMapOf("href", href,"target", target,"class", classes), consumer).visit(block)

/**
 * Audio player
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.audio(classes : String? = null, block : AUDIO.() -> Unit = {}) : Unit = AUDIO(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Push button
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.button(formEncType : ButtonFormEncType? = null, formMethod : ButtonFormMethod? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.getButton(formEncType : ButtonFormEncType? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", ButtonFormMethod.get.realValue,"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.postButton(formEncType : ButtonFormEncType? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", ButtonFormMethod.post.realValue,"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.putButton(formEncType : ButtonFormEncType? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", ButtonFormMethod.put.realValue,"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.deleteButton(formEncType : ButtonFormEncType? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", ButtonFormMethod.delete.realValue,"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)
@Suppress("DEPRECATION")
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.patchButton(formEncType : ButtonFormEncType? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : Unit = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", ButtonFormMethod.patch.realValue,"name", name,"type", type?.enumEncode(),"class", classes), consumer).visit(block)

/**
 * Plugin
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.embed(classes : String? = null, block : EMBED.() -> Unit = {}) : Unit = EMBED(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Inline subwindow
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.iframe(sandbox : IframeSandbox? = null, classes : String? = null, block : IFRAME.() -> Unit = {}) : Unit = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(),"class", classes), consumer).visit(block)
/**
 * Inline subwindow
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.iframe(sandbox : IframeSandbox? = null, classes : String? = null, content : String = "") : Unit = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(),"class", classes), consumer).visit({+content})
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowSameOriginIframe(classes : String? = null, block : IFRAME.() -> Unit = {}) : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowSameOrigin.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowFormSIframe(classes : String? = null, block : IFRAME.() -> Unit = {}) : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowFormS.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowScriptsIframe(classes : String? = null, block : IFRAME.() -> Unit = {}) : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowScripts.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowSameOriginIframe(classes : String? = null, content : String = "") : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowSameOrigin.realValue,"class", classes), consumer).visit({+content})
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowFormSIframe(classes : String? = null, content : String = "") : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowFormS.realValue,"class", classes), consumer).visit({+content})
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.allowScriptsIframe(classes : String? = null, content : String = "") : Unit = IFRAME(attributesMapOf("sandbox", IframeSandbox.allowScripts.realValue,"class", classes), consumer).visit({+content})

/**
 * Embedded image
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.img(alt : String? = null, src : String? = null, classes : String? = null, block : IMG.() -> Unit = {}) : Unit = IMG(attributesMapOf("alt", alt,"src", src,"class", classes), consumer).visit(block)

/**
 * Form control
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.input(type : InputType? = null, formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", type?.enumEncode(),"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.buttonInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.button.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.checkBoxInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.checkBox.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.colorInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.color.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.dateInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.date.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.dateTimeInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.dateTime.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.dateTimeLocalInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.dateTimeLocal.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.emailInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.email.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.fileInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.file.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.hiddenInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.hidden.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.imageInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.image.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.monthInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.month.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.numberInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.number.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.passwordInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.password.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.radioInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.radio.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.rangeInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.range.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.resetInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.reset.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.searchInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.search.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.submitInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.submit.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.textInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.text.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.telInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.tel.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.timeInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.time.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.urlInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.url.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.weekInput(formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : Unit = INPUT(attributesMapOf("type", InputType.week.realValue,"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), consumer).visit(block)

/**
 * Cryptographic key-pair generator form control
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.keyGen(keyType : KeyGenKeyType? = null, classes : String? = null, block : KEYGEN.() -> Unit = {}) : Unit = KEYGEN(attributesMapOf("keytype", keyType?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.rsaKeyGen(classes : String? = null, block : KEYGEN.() -> Unit = {}) : Unit = KEYGEN(attributesMapOf("keytype", KeyGenKeyType.rsa.realValue,"class", classes), consumer).visit(block)

/**
 * Form field label text
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.label(classes : String? = null, block : LABEL.() -> Unit = {}) : Unit = LABEL(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Generic embedded object
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.htmlObject(classes : String? = null, block : OBJECT.() -> Unit = {}) : Unit = OBJECT(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Option selector
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.select(classes : String? = null, block : SELECT.() -> Unit = {}) : Unit = SELECT(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Multi-line text field
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : String? = null, block : TEXTAREA.() -> Unit = {}) : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", wrap?.enumEncode(),"class", classes), consumer).visit(block)
/**
 * Multi-line text field
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : String? = null, content : String = "") : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", wrap?.enumEncode(),"class", classes), consumer).visit({+content})
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.hardTextArea(rows : String? = null, cols : String? = null, classes : String? = null, block : TEXTAREA.() -> Unit = {}) : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", TextAreaWrap.hard.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.softTextArea(rows : String? = null, cols : String? = null, classes : String? = null, block : TEXTAREA.() -> Unit = {}) : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", TextAreaWrap.soft.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.hardTextArea(rows : String? = null, cols : String? = null, classes : String? = null, content : String = "") : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", TextAreaWrap.hard.realValue,"class", classes), consumer).visit({+content})
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.softTextArea(rows : String? = null, cols : String? = null, classes : String? = null, content : String = "") : Unit = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", TextAreaWrap.soft.realValue,"class", classes), consumer).visit({+content})

/**
 * Video player
 */
@HtmlTagMarker
fun FlowOrInteractiveOrPhrasingContent.video(classes : String? = null, block : VIDEO.() -> Unit = {}) : Unit = VIDEO(attributesMapOf("class", classes), consumer).visit(block)


