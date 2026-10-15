package N1;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C6;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.J3;
import com.google.android.gms.internal.ads.Y9;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1187a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        m mVar = this.f1187a;
        try {
            mVar.f1202v = (I3) mVar.f1197q.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            e = e4;
            Y9.t("", e);
        } catch (ExecutionException e5) {
            e = e5;
            Y9.t("", e);
        } catch (TimeoutException e6) {
            Y9.t("", e6);
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) C6.d.r());
        l lVar = mVar.f1199s;
        builder.appendQueryParameter("query", (String) lVar.f1191r);
        builder.appendQueryParameter("pubId", (String) lVar.f1190q);
        builder.appendQueryParameter("mappver", (String) lVar.f1193t);
        TreeMap treeMap = (TreeMap) lVar.f1194u;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri build = builder.build();
        I3 i32 = mVar.f1202v;
        if (i32 != null) {
            try {
                build = I3.c(build, i32.f5531b.e(mVar.f1198r));
            } catch (J3 e7) {
                Y9.t("Unable to process ad data", e7);
            }
        }
        return n0.a.i(mVar.p(), "#", build.getEncodedQuery());
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        WebView webView = this.f1187a.f1200t;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
