package kotlinx.html.js

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*
import org.w3c.dom.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

/**
 * Anchor
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.a(href : String? = null, target : String? = null, classes : String? = null, block : A.() -> Unit = {}) : HTMLAnchorElement = A(attributesMapOf("href", href,"target", target,"class", classes), this).visitAndFinalize(this, block) as HTMLAnchorElement

/**
 * Abbreviated form (e.g., WWW, HTTP,etc.)
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.abbr(classes : String? = null, block : ABBR.() -> Unit = {}) : HTMLElement = ABBR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Information on author
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.address(classes : String? = null, block : ADDRESS.() -> Unit = {}) : HTMLElement = ADDRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Client-side image map area
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.area(shape : AreaShape? = null, alt : String? = null, classes : String? = null, block : AREA.() -> Unit = {}) : HTMLAreaElement = AREA(attributesMapOf("Shape", shape?.enumEncode(),"alt", alt,"class", classes), this).visitAndFinalize(this, block) as HTMLAreaElement

/**
 * Self-contained syndicatable or reusable composition
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.article(classes : String? = null, block : ARTICLE.() -> Unit = {}) : HTMLElement = ARTICLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Sidebar for tangentially related content
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.aside(classes : String? = null, block : ASIDE.() -> Unit = {}) : HTMLElement = ASIDE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Audio player
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.audio(classes : String? = null, block : AUDIO.() -> Unit = {}) : HTMLAudioElement = AUDIO(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLAudioElement

/**
 * Bold text style
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.b(classes : String? = null, block : B.() -> Unit = {}) : HTMLElement = B(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document base URI
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.base(classes : String? = null, block : BASE.() -> Unit = {}) : HTMLBaseElement = BASE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBaseElement

/**
 * Text directionality isolation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.bdi(classes : String? = null, block : BDI.() -> Unit = {}) : HTMLElement = BDI(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * I18N BiDi over-ride
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.bdo(classes : String? = null, block : BDO.() -> Unit = {}) : HTMLElement = BDO(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Long quotation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.blockQuote(classes : String? = null, block : BLOCKQUOTE.() -> Unit = {}) : HTMLElement = BLOCKQUOTE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Document body
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.body(classes : String? = null, block : BODY.() -> Unit = {}) : HTMLBodyElement = BODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBodyElement

/**
 * Forced line break
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.br(classes : String? = null, block : BR.() -> Unit = {}) : HTMLBRElement = BR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLBRElement

/**
 * Push button
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.button(formEncType : ButtonFormEncType? = null, formMethod : ButtonFormMethod? = null, name : String? = null, type : ButtonType? = null, classes : String? = null, block : BUTTON.() -> Unit = {}) : HTMLButtonElement = BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"type", type?.enumEncode(),"class", classes), this).visitAndFinalize(this, block) as HTMLButtonElement

/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.canvas(classes : String? = null, content : String = "") : HTMLCanvasElement = CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, {+content}) as HTMLCanvasElement
/**
 * Scriptable bitmap canvas
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.canvas(classes : String? = null, block : CANVAS.() -> Unit = {}) : HTMLCanvasElement = CANVAS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLCanvasElement

/**
 * Table caption
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.caption(classes : String? = null, block : CAPTION.() -> Unit = {}) : HTMLElement = CAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Citation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.cite(classes : String? = null, block : CITE.() -> Unit = {}) : HTMLElement = CITE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Computer code fragment
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.code(classes : String? = null, block : CODE.() -> Unit = {}) : HTMLElement = CODE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Table column
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.col(classes : String? = null, block : COL.() -> Unit = {}) : HTMLTableColElement = COL(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableColElement

/**
 * Table column group
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.colGroup(classes : String? = null, block : COLGROUP.() -> Unit = {}) : HTMLTableColElement = COLGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableColElement

@HtmlTagMarker
public fun TagConsumer<HTMLElement>.command(type : CommandType? = null, classes : String? = null, block : COMMAND.() -> Unit = {}) : HTMLElement = COMMAND(attributesMapOf("type", type?.enumEncode(),"class", classes), this).visitAndFinalize(this, block)

/**
 * Container for options for 
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dataList(classes : String? = null, block : DATALIST.() -> Unit = {}) : HTMLDataListElement = DATALIST(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDataListElement

/**
 * Definition description
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dd(classes : String? = null, block : DD.() -> Unit = {}) : HTMLElement = DD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Deleted text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.del(classes : String? = null, block : DEL.() -> Unit = {}) : HTMLElement = DEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Disclosure control for hiding details
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.details(classes : String? = null, block : DETAILS.() -> Unit = {}) : HTMLDetailsElement = DETAILS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDetailsElement

/**
 * Instance definition
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dfn(classes : String? = null, block : DFN.() -> Unit = {}) : HTMLElement = DFN(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Dialog box or window
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dialog(classes : String? = null, block : DIALOG.() -> Unit = {}) : HTMLDialogElement = DIALOG(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDialogElement

/**
 * Generic language/style container
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.div(classes : String? = null, block : DIV.() -> Unit = {}) : HTMLDivElement = DIV(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLDivElement

/**
 * Definition list
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dl(classes : String? = null, block : DL.() -> Unit = {}) : HTMLElement = DL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Definition term
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.dt(classes : String? = null, block : DT.() -> Unit = {}) : HTMLElement = DT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Emphasis
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.em(classes : String? = null, block : EM.() -> Unit = {}) : HTMLElement = EM(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Plugin
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.embed(classes : String? = null, block : EMBED.() -> Unit = {}) : HTMLEmbedElement = EMBED(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLEmbedElement

/**
 * Form control group
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.fieldSet(classes : String? = null, block : FIELDSET.() -> Unit = {}) : HTMLFieldSetElement = FIELDSET(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLFieldSetElement

/**
 * Caption for 
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.figcaption(classes : String? = null, block : FIGCAPTION.() -> Unit = {}) : HTMLElement = FIGCAPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Figure with optional caption
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.figure(classes : String? = null, block : FIGURE.() -> Unit = {}) : HTMLElement = FIGURE(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Footer for a page or section
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.footer(classes : String? = null, block : FOOTER.() -> Unit = {}) : HTMLElement = FOOTER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Interactive form
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.form(action : String? = null, encType : FormEncType? = null, method : FormMethod? = null, classes : String? = null, block : FORM.() -> Unit = {}) : HTMLFormElement = FORM(attributesMapOf("action", action,"enctype", encType?.enumEncode(),"method", method?.enumEncode(),"class", classes), this).visitAndFinalize(this, block) as HTMLFormElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h1(classes : String? = null, block : H1.() -> Unit = {}) : HTMLHeadingElement = H1(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h2(classes : String? = null, block : H2.() -> Unit = {}) : HTMLHeadingElement = H2(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h3(classes : String? = null, block : H3.() -> Unit = {}) : HTMLHeadingElement = H3(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h4(classes : String? = null, block : H4.() -> Unit = {}) : HTMLHeadingElement = H4(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h5(classes : String? = null, block : H5.() -> Unit = {}) : HTMLHeadingElement = H5(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

/**
 * Heading
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.h6(classes : String? = null, block : H6.() -> Unit = {}) : HTMLHeadingElement = H6(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHeadingElement

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document head
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.head(content : String = "") : HTMLHeadElement = HEAD(emptyMap, this).visitAndFinalize(this, {+content}) as HTMLHeadElement
/**
 * Document head
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.head(block : HEAD.() -> Unit = {}) : HTMLHeadElement = HEAD(emptyMap, this).visitAndFinalize(this, block) as HTMLHeadElement

/**
 * Introductory or navigational aids for a page or section
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.header(classes : String? = null, block : HEADER.() -> Unit = {}) : HTMLElement = HEADER(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
public fun TagConsumer<HTMLElement>.hGroup(classes : String? = null, block : HGROUP.() -> Unit = {}) : HTMLElement = HGROUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Horizontal rule
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.hr(classes : String? = null, block : HR.() -> Unit = {}) : HTMLHRElement = HR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLHRElement

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Document root element
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.html(content : String = "") : HTMLHtmlElement = HTML(emptyMap, this).visitAndFinalize(this, {+content}) as HTMLHtmlElement
/**
 * Document root element
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.html(block : HTML.() -> Unit = {}) : HTMLHtmlElement = HTML(emptyMap, this).visitAndFinalize(this, block) as HTMLHtmlElement

/**
 * Italic text style
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.i(classes : String? = null, block : I.() -> Unit = {}) : HTMLElement = I(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Inline subwindow
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.iframe(sandbox : IframeSandbox? = null, classes : String? = null, content : String = "") : HTMLElement = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(),"class", classes), this).visitAndFinalize(this, {+content})
/**
 * Inline subwindow
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.iframe(sandbox : IframeSandbox? = null, classes : String? = null, block : IFRAME.() -> Unit = {}) : HTMLElement = IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(),"class", classes), this).visitAndFinalize(this, block)

/**
 * Embedded image
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.img(alt : String? = null, src : String? = null, classes : String? = null, block : IMG.() -> Unit = {}) : HTMLImageElement = IMG(attributesMapOf("alt", alt,"src", src,"class", classes), this).visitAndFinalize(this, block) as HTMLImageElement

/**
 * Form control
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.input(type : InputType? = null, formEncType : InputFormEncType? = null, formMethod : InputFormMethod? = null, name : String? = null, classes : String? = null, block : INPUT.() -> Unit = {}) : HTMLInputElement = INPUT(attributesMapOf("type", type?.enumEncode(),"formenctype", formEncType?.enumEncode(),"formmethod", formMethod?.enumEncode(),"name", name,"class", classes), this).visitAndFinalize(this, block) as HTMLInputElement

/**
 * Inserted text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.ins(classes : String? = null, block : INS.() -> Unit = {}) : HTMLElement = INS(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Text to be entered by the user
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.kbd(classes : String? = null, block : KBD.() -> Unit = {}) : HTMLElement = KBD(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Cryptographic key-pair generator form control
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.keyGen(keyType : KeyGenKeyType? = null, classes : String? = null, block : KEYGEN.() -> Unit = {}) : HTMLElement = KEYGEN(attributesMapOf("keytype", keyType?.enumEncode(),"class", classes), this).visitAndFinalize(this, block)

/**
 * Form field label text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.label(classes : String? = null, block : LABEL.() -> Unit = {}) : HTMLLabelElement = LABEL(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLabelElement

/**
 * Fieldset legend
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.legend(classes : String? = null, block : LEGEND.() -> Unit = {}) : HTMLLegendElement = LEGEND(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLegendElement

/**
 * List item
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.li(classes : String? = null, block : LI.() -> Unit = {}) : HTMLLIElement = LI(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLLIElement

/**
 * A media-independent link
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.link(href : String? = null, rel : String? = null, type : String? = null, block : LINK.() -> Unit = {}) : HTMLLinkElement = LINK(attributesMapOf("href", href,"rel", rel,"type", type), this).visitAndFinalize(this, block) as HTMLLinkElement

/**
 * Client-side image map
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.map(name : String? = null, classes : String? = null, block : MAP.() -> Unit = {}) : HTMLMapElement = MAP(attributesMapOf("name", name,"class", classes), this).visitAndFinalize(this, block) as HTMLMapElement

/**
 * Highlight
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.mark(classes : String? = null, block : MARK.() -> Unit = {}) : HTMLElement = MARK(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
public fun TagConsumer<HTMLElement>.math(classes : String? = null, block : MATH.() -> Unit = {}) : HTMLElement = MATH(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
public fun TagConsumer<HTMLElement>.mathml(classes : String? = null, content : String = "") : HTMLElement = MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, {+content})
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.mathml(classes : String? = null, block : MATHML.() -> Unit = {}) : HTMLElement = MATHML(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.meta(name : String? = null, content : String? = null, charset : String? = null, block : META.() -> Unit = {}) : HTMLMetaElement = META(attributesMapOf("name", name,"content", content,"charset", charset), this).visitAndFinalize(this, block) as HTMLMetaElement

/**
 * Gauge
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.meter(classes : String? = null, block : METER.() -> Unit = {}) : HTMLMeterElement = METER(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLMeterElement

/**
 * Section with navigational links
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.nav(classes : String? = null, block : NAV.() -> Unit = {}) : HTMLElement = NAV(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic metainformation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.noScript(classes : String? = null, block : NOSCRIPT.() -> Unit = {}) : HTMLElement = NOSCRIPT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Generic embedded object
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.htmlObject(classes : String? = null, block : OBJECT.() -> Unit = {}) : HTMLElement = OBJECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ordered list
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.ol(classes : String? = null, block : OL.() -> Unit = {}) : HTMLElement = OL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option group
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.optGroup(label : String? = null, classes : String? = null, block : OPTGROUP.() -> Unit = {}) : HTMLOptGroupElement = OPTGROUP(attributesMapOf("label", label,"class", classes), this).visitAndFinalize(this, block) as HTMLOptGroupElement

/**
 * Selectable choice
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.option(classes : String? = null, content : String = "") : HTMLOptionElement = OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, {+content}) as HTMLOptionElement
/**
 * Selectable choice
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.option(classes : String? = null, block : OPTION.() -> Unit = {}) : HTMLOptionElement = OPTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLOptionElement

/**
 * Calculated output value
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.output(classes : String? = null, block : OUTPUT.() -> Unit = {}) : HTMLOutputElement = OUTPUT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLOutputElement

/**
 * Paragraph
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.p(classes : String? = null, block : P.() -> Unit = {}) : HTMLParagraphElement = P(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLParagraphElement

/**
 * Named property value
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.param(name : String? = null, value : String? = null, block : PARAM.() -> Unit = {}) : HTMLParamElement = PARAM(attributesMapOf("name", name,"value", value), this).visitAndFinalize(this, block) as HTMLParamElement

/**
 * Preformatted text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.pre(classes : String? = null, block : PRE.() -> Unit = {}) : HTMLPreElement = PRE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLPreElement

/**
 * Progress bar
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.progress(classes : String? = null, block : PROGRESS.() -> Unit = {}) : HTMLProgressElement = PROGRESS(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLProgressElement

/**
 * Short inline quotation
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.q(classes : String? = null, block : Q.() -> Unit = {}) : HTMLElement = Q(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Parenthesis for ruby annotation text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.rp(classes : String? = null, block : RP.() -> Unit = {}) : HTMLElement = RP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation text
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.rt(classes : String? = null, block : RT.() -> Unit = {}) : HTMLElement = RT(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Ruby annotation(s)
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.ruby(classes : String? = null, block : RUBY.() -> Unit = {}) : HTMLElement = RUBY(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Strike-through text style
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.samp(classes : String? = null, block : SAMP.() -> Unit = {}) : HTMLElement = SAMP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Script statements
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.script(type : String? = null, src : String? = null, content : String = "") : HTMLScriptElement = SCRIPT(attributesMapOf("type", type,"src", src), this).visitAndFinalize(this, {+content}) as HTMLScriptElement
/**
 * Script statements
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.script(type : String? = null, src : String? = null, block : SCRIPT.() -> Unit = {}) : HTMLScriptElement = SCRIPT(attributesMapOf("type", type,"src", src), this).visitAndFinalize(this, block) as HTMLScriptElement

/**
 * Generic document or application section
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.section(classes : String? = null, block : SECTION.() -> Unit = {}) : HTMLElement = SECTION(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Option selector
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.select(classes : String? = null, block : SELECT.() -> Unit = {}) : HTMLSelectElement = SELECT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSelectElement

/**
 * Small text style
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.small(classes : String? = null, block : SMALL.() -> Unit = {}) : HTMLElement = SMALL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Media source for 
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.source(classes : String? = null, block : SOURCE.() -> Unit = {}) : HTMLSourceElement = SOURCE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSourceElement

/**
 * Generic language/style container
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.span(classes : String? = null, block : SPAN.() -> Unit = {}) : HTMLSpanElement = SPAN(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLSpanElement

/**
 * Strong emphasis
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.strong(classes : String? = null, block : STRONG.() -> Unit = {}) : HTMLElement = STRONG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@Deprecated("This tag doesn't support content or requires unsafe (try unsafe {})")
@Suppress("DEPRECATION")
/**
 * Style info
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.style(type : String? = null, content : String = "") : HTMLStyleElement = STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, {+content}) as HTMLStyleElement
/**
 * Style info
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.style(type : String? = null, block : STYLE.() -> Unit = {}) : HTMLStyleElement = STYLE(attributesMapOf("type", type), this).visitAndFinalize(this, block) as HTMLStyleElement

/**
 * Subscript
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.sub(classes : String? = null, block : SUB.() -> Unit = {}) : HTMLElement = SUB(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Superscript
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.sup(classes : String? = null, block : SUP.() -> Unit = {}) : HTMLElement = SUP(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

@HtmlTagMarker
public fun TagConsumer<HTMLElement>.svg(classes : String? = null, content : String = "") : HTMLElement = SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, {+content})
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.svg(classes : String? = null, block : SVG.() -> Unit = {}) : HTMLElement = SVG(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * 
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.table(classes : String? = null, block : TABLE.() -> Unit = {}) : HTMLTableElement = TABLE(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableElement

/**
 * Table body
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.tbody(classes : String? = null, block : TBODY.() -> Unit = {}) : HTMLTableSectionElement = TBODY(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Table data cell
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.td(classes : String? = null, block : TD.() -> Unit = {}) : HTMLTableCellElement = TD(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableCellElement

/**
 * Multi-line text field
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : String? = null, content : String = "") : HTMLTextAreaElement = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", wrap?.enumEncode(),"class", classes), this).visitAndFinalize(this, {+content}) as HTMLTextAreaElement
/**
 * Multi-line text field
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.textArea(rows : String? = null, cols : String? = null, wrap : TextAreaWrap? = null, classes : String? = null, block : TEXTAREA.() -> Unit = {}) : HTMLTextAreaElement = TEXTAREA(attributesMapOf("rows", rows,"cols", cols,"wrap", wrap?.enumEncode(),"class", classes), this).visitAndFinalize(this, block) as HTMLTextAreaElement

/**
 * Table footer
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.tfoot(classes : String? = null, block : TFOOT.() -> Unit = {}) : HTMLTableSectionElement = TFOOT(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Table header cell
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.th(scope : ThScope? = null, classes : String? = null, block : TH.() -> Unit = {}) : HTMLTableCellElement = TH(attributesMapOf("scope", scope?.enumEncode(),"class", classes), this).visitAndFinalize(this, block) as HTMLTableCellElement

/**
 * Table header
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.thead(classes : String? = null, block : THEAD.() -> Unit = {}) : HTMLTableSectionElement = THEAD(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableSectionElement

/**
 * Machine-readable equivalent of date- or time-related data
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.time(classes : String? = null, block : TIME.() -> Unit = {}) : HTMLTimeElement = TIME(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTimeElement

/**
 * Document title
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.title(content : String = "") : HTMLTitleElement = TITLE(emptyMap, this).visitAndFinalize(this, {+content}) as HTMLTitleElement
/**
 * Document title
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.title(block : TITLE.() -> Unit = {}) : HTMLTitleElement = TITLE(emptyMap, this).visitAndFinalize(this, block) as HTMLTitleElement

/**
 * Table row
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.tr(classes : String? = null, block : TR.() -> Unit = {}) : HTMLTableRowElement = TR(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLTableRowElement

/**
 * Unordered list
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.ul(classes : String? = null, block : UL.() -> Unit = {}) : HTMLElement = UL(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Unordered list
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.htmlVar(classes : String? = null, block : VAR.() -> Unit = {}) : HTMLElement = VAR(attributesMapOf("class", classes), this).visitAndFinalize(this, block)

/**
 * Video player
 */
@HtmlTagMarker
public fun TagConsumer<HTMLElement>.video(classes : String? = null, block : VIDEO.() -> Unit = {}) : HTMLVideoElement = VIDEO(attributesMapOf("class", classes), this).visitAndFinalize(this, block) as HTMLVideoElement

