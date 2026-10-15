package x2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import l2.C1798a;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2087n extends AbstractC2076h0 {
    public long c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public AccountManager f15740e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f15741f;

    /* renamed from: g, reason: collision with root package name */
    public long f15742g;

    @Override // x2.AbstractC2076h0
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.d = n0.a.i(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long k() {
        g();
        return this.f15742g;
    }

    public final long l() {
        i();
        return this.c;
    }

    public final String m() {
        i();
        return this.d;
    }

    public final boolean n() {
        Account[] result;
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        C1798a c1798a = c2066c0.f15573n;
        K k3 = c2066c0.f15568i;
        Context context = c2066c0.f15562a;
        c1798a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f15742g > 86400000) {
            this.f15741f = null;
        }
        Boolean bool = this.f15741f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (AbstractC1895f.g(context, "android.permission.GET_ACCOUNTS") != 0) {
            C2066c0.i(k3);
            k3.f15398j.a("Permission error checking for dasher/unicorn accounts");
            this.f15742g = currentTimeMillis;
            this.f15741f = Boolean.FALSE;
            return false;
        }
        if (this.f15740e == null) {
            this.f15740e = AccountManager.get(context);
        }
        try {
            result = this.f15740e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e4) {
            e = e4;
            C2066c0.i(k3);
            k3.f15395g.b(e, "Exception checking account types");
            this.f15742g = currentTimeMillis;
            this.f15741f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e5) {
            e = e5;
            C2066c0.i(k3);
            k3.f15395g.b(e, "Exception checking account types");
            this.f15742g = currentTimeMillis;
            this.f15741f = Boolean.FALSE;
            return false;
        } catch (IOException e6) {
            e = e6;
            C2066c0.i(k3);
            k3.f15395g.b(e, "Exception checking account types");
            this.f15742g = currentTimeMillis;
            this.f15741f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f15741f = Boolean.TRUE;
            this.f15742g = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.f15740e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f15741f = Boolean.TRUE;
            this.f15742g = currentTimeMillis;
            return true;
        }
        this.f15742g = currentTimeMillis;
        this.f15741f = Boolean.FALSE;
        return false;
    }
}
