package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class YE extends C0485ci {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7799k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7800l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7801m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7802n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7803o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7804p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7805q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f7806r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f7807s;

    public YE() {
        this.f7806r = new SparseArray();
        this.f7807s = new SparseBooleanArray();
        this.f7799k = true;
        this.f7800l = true;
        this.f7801m = true;
        this.f7802n = true;
        this.f7803o = true;
        this.f7804p = true;
        this.f7805q = true;
    }

    public YE(Context context) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        String[] split;
        int i4 = AbstractC0751is.f9071a;
        if ((i4 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f8380h = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f8379g = AbstractC1137rt.t(i4 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC0751is.e(context)) {
            String i5 = i4 < 28 ? AbstractC0751is.i("sys.display-size") : AbstractC0751is.i("vendor.display-size");
            if (!TextUtils.isEmpty(i5)) {
                try {
                    split = i5.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        int i6 = point2.x;
                        int i7 = point2.y;
                        this.f8375a = i6;
                        this.f8376b = i7;
                        this.f7806r = new SparseArray();
                        this.f7807s = new SparseBooleanArray();
                        this.f7799k = true;
                        this.f7800l = true;
                        this.f7801m = true;
                        this.f7802n = true;
                        this.f7803o = true;
                        this.f7804p = true;
                        this.f7805q = true;
                    }
                }
                Wj.h("Util", "Invalid display size: ".concat(String.valueOf(i5)));
            }
            if ("Sony".equals(AbstractC0751is.c) && AbstractC0751is.d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                point2 = point;
                int i62 = point2.x;
                int i72 = point2.y;
                this.f8375a = i62;
                this.f8376b = i72;
                this.f7806r = new SparseArray();
                this.f7807s = new SparseBooleanArray();
                this.f7799k = true;
                this.f7800l = true;
                this.f7801m = true;
                this.f7802n = true;
                this.f7803o = true;
                this.f7804p = true;
                this.f7805q = true;
            }
        }
        point = new Point();
        if (i4 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        point2 = point;
        int i622 = point2.x;
        int i722 = point2.y;
        this.f8375a = i622;
        this.f8376b = i722;
        this.f7806r = new SparseArray();
        this.f7807s = new SparseBooleanArray();
        this.f7799k = true;
        this.f7800l = true;
        this.f7801m = true;
        this.f7802n = true;
        this.f7803o = true;
        this.f7804p = true;
        this.f7805q = true;
    }

    public /* synthetic */ YE(ZE ze) {
        super(ze);
        this.f7799k = ze.f7980k;
        this.f7800l = ze.f7981l;
        this.f7801m = ze.f7982m;
        this.f7802n = ze.f7983n;
        this.f7803o = ze.f7984o;
        this.f7804p = ze.f7985p;
        this.f7805q = ze.f7986q;
        SparseArray sparseArray = ze.f7987r;
        SparseArray sparseArray2 = new SparseArray();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            sparseArray2.put(sparseArray.keyAt(i4), new HashMap((Map) sparseArray.valueAt(i4)));
        }
        this.f7806r = sparseArray2;
        this.f7807s = ze.f7988s.clone();
    }
}
