package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f13664k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f13665l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f13666a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13667b = false;
    public float c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f13668e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f13669f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f13670g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f13671h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f13672i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f13673j;

    static {
        new ConcurrentHashMap();
    }

    public N(TextView textView) {
        this.f13672i = textView;
        this.f13673j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f13665l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f13667b) {
                if (this.f13672i.getMeasuredHeight() <= 0 || this.f13672i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f13672i.isHorizontallyScrollable() : ((Boolean) e(this.f13672i, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue() ? 1048576 : (this.f13672i.getMeasuredWidth() - this.f13672i.getTotalPaddingLeft()) - this.f13672i.getTotalPaddingRight();
                int height = (this.f13672i.getHeight() - this.f13672i.getCompoundPaddingBottom()) - this.f13672i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f13664k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c = c(rectF);
                        if (c != this.f13672i.getTextSize()) {
                            g(0, c);
                        }
                    } finally {
                    }
                }
            }
            this.f13667b = true;
        }
    }

    public final int c(RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f13669f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = length - 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 <= i4) {
            int i7 = (i5 + i4) / 2;
            int i8 = this.f13669f[i7];
            TextView textView = this.f13672i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i9 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f13671h;
            if (textPaint == null) {
                this.f13671h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f13671h.set(textView.getPaint());
            this.f13671h.setTextSize(i8);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f13671h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            if (i9 >= 29) {
                try {
                    textDirectionHeuristic = textView.getTextDirectionHeuristic();
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic");
            }
            obtain.setTextDirection(textDirectionHeuristic);
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i10 = i7 + 1;
                i6 = i5;
                i5 = i10;
            } else {
                i6 = i7 - 1;
                i4 = i6;
            }
        }
        return this.f13669f[i6];
    }

    public final boolean f() {
        return j() && this.f13666a != 0;
    }

    public final void g(int i4, float f4) {
        Context context = this.f13673j;
        float applyDimension = TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f13672i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f13667b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f13666a == 1) {
            if (!this.f13670g || this.f13669f.length == 0) {
                int floor = ((int) Math.floor((this.f13668e - this.d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.c) + this.d);
                }
                this.f13669f = b(iArr);
            }
            this.f13667b = true;
        } else {
            this.f13667b = false;
        }
        return this.f13667b;
    }

    public final boolean i() {
        boolean z4 = this.f13669f.length > 0;
        this.f13670g = z4;
        if (z4) {
            this.f13666a = 1;
            this.d = r0[0];
            this.f13668e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f13672i instanceof C1785s);
    }

    public final void k(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f13666a = 1;
        this.d = f4;
        this.f13668e = f5;
        this.c = f6;
        this.f13670g = false;
    }
}
