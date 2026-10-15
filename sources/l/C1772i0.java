package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import h.C1691e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13764a;

    public /* synthetic */ C1772i0(int i4) {
        this.f13764a = i4;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f13764a) {
            case 0:
                try {
                    return C1691e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e4) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e4);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    l0.c cVar = new l0.c(context);
                    cVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return cVar;
                } catch (Exception e5) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    l0.n nVar = new l0.n();
                    nVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return nVar;
                } catch (Exception e6) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e6);
                    return null;
                }
        }
    }
}
