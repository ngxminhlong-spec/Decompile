package l;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w0 extends K.c implements View.OnClickListener {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f13840M = 0;

    /* renamed from: A, reason: collision with root package name */
    public final SearchableInfo f13841A;

    /* renamed from: B, reason: collision with root package name */
    public final Context f13842B;

    /* renamed from: C, reason: collision with root package name */
    public final WeakHashMap f13843C;

    /* renamed from: D, reason: collision with root package name */
    public final int f13844D;

    /* renamed from: E, reason: collision with root package name */
    public int f13845E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f13846F;

    /* renamed from: G, reason: collision with root package name */
    public int f13847G;

    /* renamed from: H, reason: collision with root package name */
    public int f13848H;

    /* renamed from: I, reason: collision with root package name */
    public int f13849I;

    /* renamed from: J, reason: collision with root package name */
    public int f13850J;

    /* renamed from: K, reason: collision with root package name */
    public int f13851K;

    /* renamed from: L, reason: collision with root package name */
    public int f13852L;

    /* renamed from: w, reason: collision with root package name */
    public final int f13853w;

    /* renamed from: x, reason: collision with root package name */
    public final int f13854x;
    public final LayoutInflater y;

    /* renamed from: z, reason: collision with root package name */
    public final SearchView f13855z;

    public w0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1038p = true;
        this.f1039q = null;
        this.f1037o = false;
        this.f1040r = context;
        this.f1041s = -1;
        this.f1042t = new K.a(this);
        this.f1043u = new K.b(0, this);
        this.f13854x = suggestionRowLayout;
        this.f13853w = suggestionRowLayout;
        this.y = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f13845E = 1;
        this.f13847G = -1;
        this.f13848H = -1;
        this.f13849I = -1;
        this.f13850J = -1;
        this.f13851K = -1;
        this.f13852L = -1;
        this.f13855z = searchView;
        this.f13841A = searchableInfo;
        this.f13844D = searchView.getSuggestionCommitIconResId();
        this.f13842B = context;
        this.f13843C = weakHashMap;
    }

    public static String r(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    @Override // K.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.w0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // K.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f13847G = cursor.getColumnIndex("suggest_text_1");
                this.f13848H = cursor.getColumnIndex("suggest_text_2");
                this.f13849I = cursor.getColumnIndex("suggest_text_2_url");
                this.f13850J = cursor.getColumnIndex("suggest_icon_1");
                this.f13851K = cursor.getColumnIndex("suggest_icon_2");
                this.f13852L = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // K.c
    public final String c(Cursor cursor) {
        String r4;
        String r5;
        if (cursor == null) {
            return null;
        }
        String r6 = r(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (r6 != null) {
            return r6;
        }
        SearchableInfo searchableInfo = this.f13841A;
        if (searchableInfo.shouldRewriteQueryFromData() && (r5 = r(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return r5;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (r4 = r(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return r4;
    }

    @Override // K.c
    public final View e(ViewGroup viewGroup) {
        View inflate = this.y.inflate(this.f13853w, viewGroup, false);
        inflate.setTag(new v0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f13844D);
        return inflate;
    }

    @Override // K.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View inflate = this.y.inflate(this.f13854x, viewGroup, false);
            if (inflate != null) {
                ((v0) inflate.getTag()).f13835a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // K.c, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View e5 = e(viewGroup);
            ((v0) e5.getTag()).f13835a.setText(e4.toString());
            return e5;
        }
    }

    public final Drawable h(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1040r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable i(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.w0.i(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1039q;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1039q;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f13855z.p((CharSequence) tag);
        }
    }

    public final Cursor p(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1040r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }
}
