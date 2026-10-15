package l0;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import z.AbstractC2123b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1793a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f13869a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13870b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13871e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13872f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13873g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f13874h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f13875i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f13876j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f13877k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a3, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03ae, code lost:
    
        if (r1 >= r3) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b0, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03be, code lost:
    
        if (r33 != 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c0, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c4, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x039f, code lost:
    
        if (r32 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a1, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.AbstractC1793a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i4, int i5, int i6, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i5);
        int i7 = 1;
        boolean z4 = peekValue != null;
        int i8 = z4 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i6);
        boolean z5 = peekValue2 != null;
        int i9 = z5 ? peekValue2.type : 0;
        if (i4 == 4) {
            i4 = ((z4 && c(i8)) || (z5 && c(i9))) ? 3 : 0;
        }
        boolean z6 = i4 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i4 == 2) {
            String string = typedArray.getString(i5);
            String string2 = typedArray.getString(i6);
            A.e[] e4 = android.support.v4.media.session.a.e(string);
            A.e[] e5 = android.support.v4.media.session.a.e(string2);
            if (e4 != null || e5 != null) {
                if (e4 != null) {
                    O2.f fVar = new O2.f(i7);
                    if (e5 == null) {
                        return PropertyValuesHolder.ofObject(str, fVar, e4);
                    }
                    if (android.support.v4.media.session.a.b(e4, e5)) {
                        return PropertyValuesHolder.ofObject(str, fVar, e4, e5);
                    }
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                if (e5 != null) {
                    return PropertyValuesHolder.ofObject(str, new O2.f(i7), e5);
                }
            }
            return null;
        }
        d dVar = i4 == 3 ? d.f13883a : null;
        if (z6) {
            if (z4) {
                float dimension = i8 == 5 ? typedArray.getDimension(i5, 0.0f) : typedArray.getFloat(i5, 0.0f);
                if (z5) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i9 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i9 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z4) {
            int dimension2 = i8 == 5 ? (int) typedArray.getDimension(i5, 0.0f) : c(i8) ? typedArray.getColor(i5, 0) : typedArray.getInt(i5, 0);
            if (z5) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i9 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : c(i9) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z5) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : c(i9) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0));
        }
        if (propertyValuesHolder != null && dVar != null) {
            propertyValuesHolder.setEvaluator(dVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i4;
        ValueAnimator valueAnimator2;
        TypedArray g4 = AbstractC2123b.g(resources, theme, attributeSet, f13873g);
        TypedArray g5 = AbstractC2123b.g(resources, theme, attributeSet, f13877k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j4 = AbstractC2123b.d(xmlPullParser, "duration") ? g4.getInt(1, 300) : 300;
        long j5 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? g4.getInt(2, 0) : 0;
        int i5 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? g4.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i5 == 4) {
                TypedValue peekValue = g4.peekValue(5);
                boolean z4 = peekValue != null;
                int i6 = z4 ? peekValue.type : 0;
                TypedValue peekValue2 = g4.peekValue(6);
                boolean z5 = peekValue2 != null;
                i5 = ((z4 && c(i6)) || (z5 && c(z5 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b4 = b(g4, i5, 5, 6, "");
            if (b4 != null) {
                valueAnimator3.setValues(b4);
            }
        }
        valueAnimator3.setDuration(j4);
        valueAnimator3.setStartDelay(j5);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? g4.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? g4.getInt(4, 1) : 1);
        if (g5 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String c2 = AbstractC2123b.c(g5, xmlPullParser, "pathData", 1);
            if (c2 != null) {
                String c4 = AbstractC2123b.c(g5, xmlPullParser, "propertyXName", 2);
                String c5 = AbstractC2123b.c(g5, xmlPullParser, "propertyYName", 3);
                if (i5 != 2) {
                }
                if (c4 == null && c5 == null) {
                    throw new InflateException(g5.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    A.e.b(android.support.v4.media.session.a.e(c2), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f4 = 0.0f;
                    do {
                        f4 += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f4));
                    } while (pathMeasure.nextContour());
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int min = Math.min(100, ((int) (f4 / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f5 = f4 / (min - 1);
                    int i7 = 0;
                    valueAnimator = valueAnimator3;
                    float f6 = 0.0f;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= min) {
                            break;
                        }
                        int i9 = min;
                        pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i7)).floatValue(), fArr3, null);
                        fArr[i8] = fArr3[0];
                        fArr2[i8] = fArr3[1];
                        int i10 = i7 + 1;
                        f6 += f5;
                        if (i10 < arrayList.size() && f6 > ((Float) arrayList.get(i10)).floatValue()) {
                            pathMeasure2.nextContour();
                            i7 = i10;
                        }
                        i8++;
                        min = i9;
                    }
                    PropertyValuesHolder ofFloat = c4 != null ? PropertyValuesHolder.ofFloat(c4, fArr) : null;
                    PropertyValuesHolder ofFloat2 = c5 != null ? PropertyValuesHolder.ofFloat(c5, fArr2) : null;
                    if (ofFloat == null) {
                        objectAnimator2.setValues(ofFloat2);
                    } else if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                    i4 = 0;
                } catch (RuntimeException e4) {
                    throw new RuntimeException("Error in parsing ".concat(c2), e4);
                }
            } else {
                valueAnimator = valueAnimator3;
                i4 = 0;
                objectAnimator2.setPropertyName(AbstractC2123b.c(g5, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i4 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? g4.getResourceId(i4, i4) : i4;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        g4.recycle();
        if (g5 != null) {
            g5.recycle();
        }
        return valueAnimator2;
    }
}
