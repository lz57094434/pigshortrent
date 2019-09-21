layui.define(["jquery", "layer", "form"], function (e) {
    "use strict";
    var t, n = layui.jquery, i = layui.form, o = layui.layer, r = layui.device(),
        s = {read: (t = document.createElement("style"), t.innerHTML = ".slider-item{height:38px;line-height:38px;background-color:#d0d0d0;position:relative;border: 1px solid white;}.slider-bg{position:absolute;width:40px;height:100%;z-index:100}.slider-btn{width:40px;height:96%;position:absolute;border:1px solid #ccc;cursor:move;text-align:center;background-color:#fff;user-select:none;color:#666;z-index:120}.slider-btn-success{font-size:26px}.slider-text{position:absolute;text-align:center;width:100%;height:100%;user-select:none;font-size:14px;color:#fff;z-index:120}.slider-error{animation:glow 800ms ease-out infinite alternate;}@keyframes glow{0%{border-color:#e6e6e6}100%{border-color:#ff5722}}", t.type = "text/css", void (n("head link:last")[0] && n("head link:last").after(t) || n("head").append(t)))},
        d = function (e) {
            return e[0]
        }, c = function (e) {
            this.config = n.extend({}, this.config, e), this.render()
        };
    c.prototype.config = {
        elem: "",
        onOk: null,
        isOk: !1,
        isAutoVerify: !0,
        bg: "layui-bg-green",
        text: "请拖动滑块验证"
    }, c.prototype.render = function () {
        var e = this.config, t = n(e.elem);
        if (t[0]) {
            e.domid && e.domid.remove(), e.domid = this.createIdNum();
            var o = n(['<div id="' + e.domid + '"' + (e.isAutoVerify ? 'lay-verify="sliderVerify"' : "") + 'class="slider-item">', '<div class="slider-bg ' + e.bg + '"></div>', '<div class="slider-text">' + e.text + "</div>", '<div class="slider-btn layui-icon layui-icon-next"></div>'].join(""));
            t.hide().after(o), e.domid = n("#" + e.domid), this.events(), e.isAutoVerify && i.verify({
                sliderVerify: function (t, n) {
                    if (!t) return n.classList.add("slider-error"), e.text
                }
            })
        }
    }, c.prototype.isMobile = function () {
        return "ios" == r.os || "android" == r.os || r.weixin
    }, c.prototype.createIdNum = function () {
        return "sliderVerify" + (+new Date).toString() + Math.random().toString().substr(2, 7)
    }, c.prototype.isOk = function () {
        return this.config.isOk
    }, c.prototype.error = function (e) {
        return o.msg(e, {icon: 5})
    }, c.prototype.distance = function () {
        var e = this.config.container;
        return e.box.offsetWidth - e.btn.offsetWidth
    }, c.prototype.reset = function () {
        return this.config.isOk = !1, this.render()
    }, c.prototype.resize = function (e) {
        var t = this.config.container;
        e = e || this.distance();
        t.btn.style.left = e + "px", t.bg.style.width = e + "px"
    }, c.prototype.cancelTransition = function () {
        var e = this.config.container;
        this.config.domid[0].classList.remove("slider-error"), e.btn.style.transition = "", e.bg.style.transition = ""
    }, c.prototype.down = function (e) {
        var t = this, n = (t.config.container, (e = e || window.event).clientX || e.touches[0].clientX);
        t.cancelTransition();
        var i = function (e) {
            t.move(n, e)
        };
        t.events.move = i, t.isMobile() ? document.addEventListener("touchmove", t.events.move) : document.onmousemove = i
    }, c.prototype.move = function (e, t) {
        var n = this, i = n.config, o = i.container;
        var r = ((t = t || window.event).clientX || t.touches[0].clientX) - e;
        if (r > o.distance ? r = o.distance : r < 0 && (r = 0), o.btn.style.left = r + "px", o.bg.style.width = r + "px", r == o.distance) {
            o.text.innerHTML = "验证通过";
            var s = window.getComputedStyle ? window.getComputedStyle(o.bg, null) : o.bg.currentStyle;
            return o.btn.style.border = "1px solid " + s.backgroundColor, o.btn.style.color = s.backgroundColor, o.btn.classList.remove("layui-icon-next"), o.btn.classList.add("layui-icon-ok-circle", "slider-btn-success"), i.isOk = !0, o.box.value = !0, n.isMobile() ? (o.btn.removeEventListener("touchstart", n.events.down, !1), document.removeEventListener("touchmove", n.events.move, !1)) : (o.btn.onmousedown = null, document.onmousemove = null), void (i.onOk && "function" == typeof i.onOk && i.onOk())
        }
        var d = function (e) {
            n.stop(e)
        };
        n.events.seup = d, n.isMobile() ? document.addEventListener("touchend", d) : document.onmouseup = d
    }, c.prototype.stop = function (e) {
        var t = this.config.container;
        this.isOk() || (t.btn.style.left = 0, t.bg.style.width = 0, t.btn.style.transition = "left 1s", t.bg.style.transition = "width 1s", document.onmousemove = null, document.onmouseup = null, this.isMobile() && (document.removeEventListener("touchmove", this.events.move, !1), document.removeEventListener("touchend", this.events.seup, !1)))
    }, c.prototype.events = function () {
        var e = this, t = e.config;
        if (!t.domid) return e.error("创建滑块验证失败");
        var i = t.domid.find(".slider-btn"), o = t.domid.find(".slider-bg"), r = t.domid.find(".slider-text"),
            s = {box: d(t.domid), btn: d(i), bg: d(o), text: d(r)};
        t.container = s, s.distance = e.distance();
        var c = function (t) {
            e.down(t)
        };
        e.events.down = c, e.isMobile() ? s.btn.addEventListener("touchstart", e.events.down) : s.btn.onmousedown = c, n(window).on("resize", t.domid, function () {
            e.config.isOk && e.resize()
        })
    }, s.render = function (e) {
        var t = new c(e);
        return function () {
            var e = this;
            return {
                isOk: function () {
                    return e.isOk.call(e)
                }, reset: function () {
                    return e.reset.call(e)
                }
            }
        }.call(t)
    }, e("sliderVerify", s)
});