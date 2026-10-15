package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.AbstractC2123b;
import z.AbstractC2124c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: x, reason: collision with root package name */
    public static final PorterDuff.Mode f13931x = PorterDuff.Mode.SRC_IN;

    /* renamed from: p, reason: collision with root package name */
    public l f13932p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuffColorFilter f13933q;

    /* renamed from: r, reason: collision with root package name */
    public ColorFilter f13934r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13935s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13936t;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f13937u;

    /* renamed from: v, reason: collision with root package name */
    public final Matrix f13938v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f13939w;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, l0.l] */
    public n() {
        this.f13936t = true;
        this.f13937u = new float[9];
        this.f13938v = new Matrix();
        this.f13939w = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = f13931x;
        constantState.f13921b = new k();
        this.f13932p = constantState;
    }

    public n(l lVar) {
        this.f13936t = true;
        this.f13937u = new float[9];
        this.f13938v = new Matrix();
        this.f13939w = new Rect();
        this.f13932p = lVar;
        this.f13933q = a(lVar.c, lVar.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13884o;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f13939w;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f13934r;
        if (colorFilter == null) {
            colorFilter = this.f13933q;
        }
        Matrix matrix = this.f13938v;
        canvas.getMatrix(matrix);
        float[] fArr = this.f13937u;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        l lVar = this.f13932p;
        Bitmap bitmap = lVar.f13923f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != lVar.f13923f.getHeight()) {
            lVar.f13923f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            lVar.f13928k = true;
        }
        if (this.f13936t) {
            l lVar2 = this.f13932p;
            if (lVar2.f13928k || lVar2.f13924g != lVar2.c || lVar2.f13925h != lVar2.d || lVar2.f13927j != lVar2.f13922e || lVar2.f13926i != lVar2.f13921b.getRootAlpha()) {
                l lVar3 = this.f13932p;
                lVar3.f13923f.eraseColor(0);
                Canvas canvas2 = new Canvas(lVar3.f13923f);
                k kVar = lVar3.f13921b;
                kVar.a(kVar.f13911g, k.f13906p, canvas2, min, min2);
                l lVar4 = this.f13932p;
                lVar4.f13924g = lVar4.c;
                lVar4.f13925h = lVar4.d;
                lVar4.f13926i = lVar4.f13921b.getRootAlpha();
                lVar4.f13927j = lVar4.f13922e;
                lVar4.f13928k = false;
            }
        } else {
            l lVar5 = this.f13932p;
            lVar5.f13923f.eraseColor(0);
            Canvas canvas3 = new Canvas(lVar5.f13923f);
            k kVar2 = lVar5.f13921b;
            kVar2.a(kVar2.f13911g, k.f13906p, canvas3, min, min2);
        }
        l lVar6 = this.f13932p;
        if (lVar6.f13921b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (lVar6.f13929l == null) {
                Paint paint2 = new Paint();
                lVar6.f13929l = paint2;
                paint2.setFilterBitmap(true);
            }
            lVar6.f13929l.setAlpha(lVar6.f13921b.getRootAlpha());
            lVar6.f13929l.setColorFilter(colorFilter);
            paint = lVar6.f13929l;
        }
        canvas.drawBitmap(lVar6.f13923f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getAlpha() : this.f13932p.f13921b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13932p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getColorFilter() : this.f13934r;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13884o != null && Build.VERSION.SDK_INT >= 24) {
            return new m(this.f13884o.getConstantState());
        }
        this.f13932p.f13920a = getChangingConfigurations();
        return this.f13932p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f13932p.f13921b.f13913i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f13932p.f13921b.f13912h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [l0.j, java.lang.Object, l0.g] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i4;
        char c;
        int i5;
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        l lVar = this.f13932p;
        lVar.f13921b = new k();
        TypedArray g4 = AbstractC2123b.g(resources, theme, attributeSet, AbstractC1793a.f13869a);
        l lVar2 = this.f13932p;
        k kVar = lVar2.f13921b;
        int i6 = !AbstractC2123b.d(xmlPullParser, "tintMode") ? -1 : g4.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        lVar2.d = mode;
        ColorStateList colorStateList = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            g4.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 < 28 || i8 > 31) {
                Resources resources2 = g4.getResources();
                int resourceId = g4.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC2124c.f15926a;
                try {
                    colorStateList = AbstractC2124c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            lVar2.c = colorStateList2;
        }
        boolean z4 = lVar2.f13922e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = g4.getBoolean(5, z4);
        }
        lVar2.f13922e = z4;
        float f4 = kVar.f13914j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f4 = g4.getFloat(7, f4);
        }
        kVar.f13914j = f4;
        float f5 = kVar.f13915k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f5 = g4.getFloat(8, f5);
        }
        kVar.f13915k = f5;
        if (kVar.f13914j <= 0.0f) {
            throw new XmlPullParserException(g4.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 <= 0.0f) {
            throw new XmlPullParserException(g4.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        kVar.f13912h = g4.getDimension(3, kVar.f13912h);
        float dimension = g4.getDimension(2, kVar.f13913i);
        kVar.f13913i = dimension;
        if (kVar.f13912h <= 0.0f) {
            throw new XmlPullParserException(g4.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(g4.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = kVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = g4.getFloat(4, alpha);
        }
        kVar.setAlpha(alpha);
        String string = g4.getString(0);
        if (string != null) {
            kVar.f13917m = string;
            kVar.f13919o.put(string, kVar);
        }
        g4.recycle();
        lVar.f13920a = getChangingConfigurations();
        lVar.f13928k = true;
        l lVar3 = this.f13932p;
        k kVar2 = lVar3.f13921b;
        ArrayDeque arrayDeque = new ArrayDeque();
        h hVar = kVar2.f13911g;
        r.e eVar = kVar2.f13919o;
        arrayDeque.push(hVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                h hVar2 = (h) arrayDeque.peek();
                i4 = depth;
                if ("path".equals(name)) {
                    ?? jVar = new j();
                    jVar.f13885e = 0.0f;
                    jVar.f13887g = 1.0f;
                    jVar.f13888h = 1.0f;
                    jVar.f13889i = 0.0f;
                    jVar.f13890j = 1.0f;
                    jVar.f13891k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    jVar.f13892l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    jVar.f13893m = join;
                    jVar.f13894n = 4.0f;
                    TypedArray g5 = AbstractC2123b.g(resources, theme, attributeSet, AbstractC1793a.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = g5.getString(0);
                        if (string2 != null) {
                            jVar.f13905b = string2;
                        }
                        String string3 = g5.getString(2);
                        if (string3 != null) {
                            jVar.f13904a = android.support.v4.media.session.a.e(string3);
                        }
                        jVar.f13886f = AbstractC2123b.b(g5, xmlPullParser, theme, "fillColor", 1);
                        float f6 = jVar.f13888h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f6 = g5.getFloat(12, f6);
                        }
                        jVar.f13888h = f6;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? g5.getInt(8, -1) : -1;
                        jVar.f13892l = i9 != 0 ? i9 != 1 ? i9 != 2 ? jVar.f13892l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? g5.getInt(9, -1) : -1;
                        jVar.f13893m = i10 != 0 ? i10 != 1 ? i10 != 2 ? jVar.f13893m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f7 = jVar.f13894n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f7 = g5.getFloat(10, f7);
                        }
                        jVar.f13894n = f7;
                        jVar.d = AbstractC2123b.b(g5, xmlPullParser, theme, "strokeColor", 3);
                        float f8 = jVar.f13887g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f8 = g5.getFloat(11, f8);
                        }
                        jVar.f13887g = f8;
                        float f9 = jVar.f13885e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f9 = g5.getFloat(4, f9);
                        }
                        jVar.f13885e = f9;
                        float f10 = jVar.f13890j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f10 = g5.getFloat(6, f10);
                        }
                        jVar.f13890j = f10;
                        float f11 = jVar.f13891k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f11 = g5.getFloat(7, f11);
                        }
                        jVar.f13891k = f11;
                        float f12 = jVar.f13889i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f12 = g5.getFloat(5, f12);
                        }
                        jVar.f13889i = f12;
                        int i11 = jVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = g5.getInt(13, i11);
                        }
                        jVar.c = i11;
                    }
                    g5.recycle();
                    hVar2.f13896b.add(jVar);
                    if (jVar.getPathName() != null) {
                        eVar.put(jVar.getPathName(), jVar);
                    }
                    lVar3.f13920a = lVar3.f13920a;
                    z5 = false;
                    c = '\b';
                } else {
                    c = '\b';
                    if ("clip-path".equals(name)) {
                        j jVar2 = new j();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray g6 = AbstractC2123b.g(resources, theme, attributeSet, AbstractC1793a.d);
                            String string4 = g6.getString(0);
                            if (string4 != null) {
                                jVar2.f13905b = string4;
                            }
                            String string5 = g6.getString(1);
                            if (string5 != null) {
                                jVar2.f13904a = android.support.v4.media.session.a.e(string5);
                            }
                            jVar2.c = !AbstractC2123b.d(xmlPullParser, "fillType") ? 0 : g6.getInt(2, 0);
                            g6.recycle();
                        }
                        hVar2.f13896b.add(jVar2);
                        if (jVar2.getPathName() != null) {
                            eVar.put(jVar2.getPathName(), jVar2);
                        }
                        lVar3.f13920a = lVar3.f13920a;
                    } else if ("group".equals(name)) {
                        h hVar3 = new h();
                        TypedArray g7 = AbstractC2123b.g(resources, theme, attributeSet, AbstractC1793a.f13870b);
                        float f13 = hVar3.c;
                        if (AbstractC2123b.d(xmlPullParser, "rotation")) {
                            f13 = g7.getFloat(5, f13);
                        }
                        hVar3.c = f13;
                        hVar3.d = g7.getFloat(1, hVar3.d);
                        hVar3.f13897e = g7.getFloat(2, hVar3.f13897e);
                        float f14 = hVar3.f13898f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f14 = g7.getFloat(3, f14);
                        }
                        hVar3.f13898f = f14;
                        float f15 = hVar3.f13899g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f15 = g7.getFloat(4, f15);
                        }
                        hVar3.f13899g = f15;
                        float f16 = hVar3.f13900h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f16 = g7.getFloat(6, f16);
                        }
                        hVar3.f13900h = f16;
                        float f17 = hVar3.f13901i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f17 = g7.getFloat(7, f17);
                        }
                        hVar3.f13901i = f17;
                        String string6 = g7.getString(0);
                        if (string6 != null) {
                            hVar3.f13903k = string6;
                        }
                        hVar3.c();
                        g7.recycle();
                        hVar2.f13896b.add(hVar3);
                        arrayDeque.push(hVar3);
                        if (hVar3.getGroupName() != null) {
                            eVar.put(hVar3.getGroupName(), hVar3);
                        }
                        lVar3.f13920a = lVar3.f13920a;
                    }
                }
                i5 = 1;
            } else {
                i4 = depth;
                c = '\b';
                i5 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i7 = i5;
            depth = i4;
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
        this.f13933q = a(lVar.c, lVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.isAutoMirrored() : this.f13932p.f13922e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        l lVar = this.f13932p;
        if (lVar == null) {
            return false;
        }
        k kVar = lVar.f13921b;
        if (kVar.f13918n == null) {
            kVar.f13918n = Boolean.valueOf(kVar.f13911g.a());
        }
        if (kVar.f13918n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f13932p.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, l0.l] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f13935s && super.mutate() == this) {
            l lVar = this.f13932p;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = f13931x;
            if (lVar != null) {
                constantState.f13920a = lVar.f13920a;
                k kVar = new k(lVar.f13921b);
                constantState.f13921b = kVar;
                if (lVar.f13921b.f13909e != null) {
                    kVar.f13909e = new Paint(lVar.f13921b.f13909e);
                }
                if (lVar.f13921b.d != null) {
                    constantState.f13921b.d = new Paint(lVar.f13921b.d);
                }
                constantState.c = lVar.c;
                constantState.d = lVar.d;
                constantState.f13922e = lVar.f13922e;
            }
            this.f13932p = constantState;
            this.f13935s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        l lVar = this.f13932p;
        ColorStateList colorStateList = lVar.c;
        if (colorStateList == null || (mode = lVar.d) == null) {
            z4 = false;
        } else {
            this.f13933q = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        k kVar = lVar.f13921b;
        if (kVar.f13918n == null) {
            kVar.f13918n = Boolean.valueOf(kVar.f13911g.a());
        }
        if (kVar.f13918n.booleanValue()) {
            boolean b4 = lVar.f13921b.f13911g.b(iArr);
            lVar.f13928k |= b4;
            if (b4) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f13932p.f13921b.getRootAlpha() != i4) {
            this.f13932p.f13921b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f13932p.f13922e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13934r = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            android.support.v4.media.session.a.r(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        l lVar = this.f13932p;
        if (lVar.c != colorStateList) {
            lVar.c = colorStateList;
            this.f13933q = a(colorStateList, lVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        l lVar = this.f13932p;
        if (lVar.d != mode) {
            lVar.d = mode;
            this.f13933q = a(lVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        Drawable drawable = this.f13884o;
        return drawable != null ? drawable.setVisible(z4, z5) : super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13884o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
