package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import k.m;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726h extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f13314e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f13315f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13316a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13317b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        f13314e = clsArr;
        f13315f = clsArr;
    }

    public C1726h(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f13316a = objArr;
        this.f13317b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x022a, code lost:
    
        if (r8 != null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C1726h.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof m)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i4);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (XmlPullParserException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
